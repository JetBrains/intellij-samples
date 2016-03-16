package com.jetbrains.debugging;

import java.util.Arrays;
import java.util.LinkedList;

public class ProducerConsumer {
    public static String name;

    public static void main(String[] args) {
        name = args[0];
        final LinkedList<Thread> pdcon = new LinkedList<>();
        final LinkedList<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(args));

        for (int x = 0; x < 10; x++) {
            final int t = x;
            pdcon.push(new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ignored) {}
                    synchronized (queue) {
                        while (queue.size() == 10) {
                            try {
                                System.out.println("Producer-" + t + " waiting for consumer...");
                                queue.wait();
                            } catch (Exception ignored) {
                            }
                        }

                        queue.push(t + ":" + i);
                        System.out.println("Producer-" + t + " put " + i + "\t" + queue);
                        queue.notifyAll();
                    }
                }
            }));
        }
        for (int x = 0; x < 10; x++) {
            final int t = x;
            pdcon.push(new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ignored) {}
                    synchronized (queue) {
                        while (queue.size() == 0) {
                            try {
                                System.out.println("Consumer-" + t + " waiting for product...");
                                queue.wait();
                            } catch (Exception ignored) {
                            }
                        }
                        System.out.println("Consumer-" + t + " got " + queue.poll() + "\t" + queue);
                        queue.notify();
                    }
                }
            }));
        }

        for(Thread t : pdcon) {
            t.start();
        }
    }

}
