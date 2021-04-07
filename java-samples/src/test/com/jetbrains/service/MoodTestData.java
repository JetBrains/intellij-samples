package com.jetbrains.service;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

class MoodTestData {
    private static final Set<String> POSSIBLE_MOODS = Set.of("HAPPY", "SAD");
    private static final Random random = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var scheduledFuture = newScheduledThreadPool(1).scheduleAtFixedRate(
                () -> System.out.println(getRandomMood()),
                0, 500, MILLISECONDS);
        scheduledFuture.get();
    }

    private static String getRandomMood() {
        int i = 0;
        int requiredIndex = random.nextInt(2);
        for (String handle : POSSIBLE_MOODS) {
            if (i == requiredIndex) {
                return handle;
            }
            i = i + 1;
        }
        return null;
    }

}
