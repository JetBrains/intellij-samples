package com.jetbrains.refactoring;

/**
 * Created by breandan on 2/9/2015.
 */
public class PullMembersUp {
    public class A {
        class B extends A {
            public void ab() {
                System.out.println("a");
                System.out.println("b");
            }

            //Pull these methods up to superclass
            public void a() {
                System.out.println("a");
            }

            public void b() {
                System.out.println("b");
            }

            public void c() {
                System.out.println("c");
            }

            public void d() {
                System.out.println("d");
            }
        }

        class C extends A {
            public void cd() {
                System.out.println("c");
                System.out.println("d");
            }
        }

        class D extends A {
            public void da() {
                System.out.println("d");
                System.out.println("a");
            }
        }
    }
}
