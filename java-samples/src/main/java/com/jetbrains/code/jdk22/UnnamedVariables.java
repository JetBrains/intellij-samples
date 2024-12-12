package com.jetbrains.code.jdk22;

import com.jetbrains.entity.Order;

import java.awt.Point;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * <ul>
 *     <li>#PreviewFeature   #JDK21</li>
 *     <li>#StandardFeature  #JDK22</li>
 * </ul>
 * See: <a href="https://openjdk.org/jeps/456">JEP 456</a>
 */
public class UnnamedVariables {
    static int suggestReplacingUnusedVariableWithUnderscore(Iterable<Order> orders) {
        int total = 0;
        for (Order order : orders)    // order is unused
            total++;
        return total;
    }

    static void demoUseOfUnderscore() {
        var q = new ArrayBlockingQueue<Integer>(3, true, List.of(1, 2, 3));
        while (q.size() >= 3) {
            int x = q.remove();
            int y = q.remove();
            int _ = q.remove();            // z is unused
            new Point(x, y);
        }
    }

    static int demoUseOfUnderscoreInException(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException _) {
            System.out.println("Bad number: " + s);
            return 0;
        }
    }
}
