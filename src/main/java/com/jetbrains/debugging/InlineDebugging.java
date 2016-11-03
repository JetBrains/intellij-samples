package com.jetbrains.debugging;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;


public class InlineDebugging implements Runnable {
    static class MyList<T> {
        T head;
        MyList<T> tail = null;

        MyList(List<T> list) {
            if (!list.isEmpty()) {
                head = list.get(0);
                tail = new MyList<T>(list.subList(1, list.size()));
            }
        }
    }

    private static MyList<String> list;

    public static void main(String[] args) {
        new InlineDebugging().run();
    }

    @Override
    public void run() {
        MyList<Integer> list = new MyList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(getNthFromLast(list, 2));

        int i = StringUtils.getLevenshteinDistance("intellij", "idea", 3);
        double j = StringUtils.getJaroWinklerDistance("intellij", "idea");

        System.out.println(i + "," + j);
    }

    private static <T> T getNthFromLast(MyList<T> list, int n) {
        int i = 0;
        MyList<T> nthFromLast = null, last = list;

        while ((last = last.tail) != null) {
            if (i++ >= n) { //Breakpoint
                nthFromLast = (nthFromLast == null ? list : nthFromLast.tail);
            }
        }

        return nthFromLast.head;
    }
}
