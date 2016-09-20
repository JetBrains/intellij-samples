package com.jetbrains.refactoring;


public class PushMembersDown {
    public class A {
        //Push these members down to subclasses
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

        class B extends A {
            public void ab() {
                a();
                b();
            }
        }

        class C extends A {
            public void cd() {
                c();
                d();
            }
        }

        class D extends A {
            public void da() {
                d();
                a();
            }
        }
    }
}
