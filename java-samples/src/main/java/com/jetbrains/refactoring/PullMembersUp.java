package com.jetbrains.refactoring;


@SuppressWarnings("unused")
public class PullMembersUp {
    public static class A {

        static class B extends A {
            public void ab() {
                a();
                b();
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
        }

        static class C extends A {
            public void bc() {
                b();
                c();
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
        }

        static class D extends A {
            public void ca() {
                c();
                a();
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
        }
    }
}
