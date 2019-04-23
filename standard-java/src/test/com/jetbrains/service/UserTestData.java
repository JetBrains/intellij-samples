package com.jetbrains.service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class UserTestData {
    private static final List<String> EXAMPLE_HANDLES =
            List.of("aaa", "bbb", "ccc", "ddd", "eee", "fff", "gee", "ggg", "hhh", "iii", "jjj", "kkk", "lll", "mmm",
                    "nnn", "ooo", "ppp", "qqq", "rrr", "sss", "ttt", "uuu", "vvv", "www", "xxx", "yyy", "zzz");

    private static final Random random = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var scheduledFuture = newScheduledThreadPool(1).scheduleAtFixedRate(
                () -> System.out.println(getRandomTwitterHandle()),
                0, 500, MILLISECONDS);
        scheduledFuture.get();
    }

    private static String getRandomTwitterHandle() {
        return EXAMPLE_HANDLES.get(random.nextInt(27));
    }
}
