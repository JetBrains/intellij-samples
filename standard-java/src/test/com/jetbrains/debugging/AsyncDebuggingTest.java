package com.jetbrains.debugging;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class AsyncDebuggingTest {
    @Test
    public void shouldBeAbleToDebugAsyncStacktraces() throws ExecutionException, InterruptedException {

        final Future<?> result = newSingleThreadExecutor().submit(new InvokeLater());
        final Object waitForResult = result.get();
    }


    static final class InvokeLater implements Runnable {

        @Override
        public void run() {
            newSingleThreadExecutor().submit(InvokeLater::output);
        }

        private static void output() {
            System.out.println("Finally");
        }
    }
}

