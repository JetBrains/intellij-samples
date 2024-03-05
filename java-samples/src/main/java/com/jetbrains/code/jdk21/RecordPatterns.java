package com.jetbrains.code.jdk21;

/**
 * <ul>
 *     <li>#StandardFeature #JDK21</li>
 * </ul>
 * See: <a href="https://openjdk.org/jeps/440">JEP 440</a>
 */
public class RecordPatterns {

    // Not sure why, but the inspection doesn't seem to trigger for this code
    static int sum(Object obj) {
        if (obj instanceof Point p) {
            int x = p.x();
            int y = p.y();
            return (x + y);
        }
        return 0;
    }

    static int sumUpdated(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            return (x+y);
        }
        return 0;
    }
}

