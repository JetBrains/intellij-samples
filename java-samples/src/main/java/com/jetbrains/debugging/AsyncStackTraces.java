package com.jetbrains.debugging;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executors;

@SuppressWarnings("CodeBlock2Expr")
public class AsyncStackTraces {

    public static void main(String[] args) {
        Runnable thingToDo = getThingToDo();
        doThing(thingToDo);
    }

    private static void doThing(Runnable thingToDo) {
        Executors.newSingleThreadExecutor().submit(thingToDo);
    }

    @NotNull
    private static Runnable getThingToDo() {
        return () -> {
            //breakpoint here
            System.out.println("Running...");
        };
    }

}
