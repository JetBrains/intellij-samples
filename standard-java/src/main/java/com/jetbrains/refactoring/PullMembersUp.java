package com.jetbrains.refactoring;


public class PullMembersUp {
    public class A {

        class B extends A {
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

        class C extends A {
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

        class D extends A {
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
