package com.jetbrains.debugging;

import org.jetbrains.annotations.Async;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AsyncSchedulerExample {

    @SuppressWarnings("InfiniteLoopStatement") // this is intentional
    public static void main(String[] args) throws InterruptedException {
        final var messageQueue = new MessageQueue();
        new Thread(() -> {
            try {
                while (true) {
                    messageQueue.processNext();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        messageQueue.schedule("message 1");
        messageQueue.schedule("message 2");
        messageQueue.schedule("message 3");
    }

    private static final class MessageQueue {
        private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        private void schedule(@Async.Schedule String message) throws InterruptedException {
            queue.put(message);
        }

        private void process(@Async.Execute String message) {
            // Put a breakpoint here
            System.out.println("Processing " + message);
        }

        private void processNext() throws InterruptedException {
            process(queue.take());
        }
    }
}