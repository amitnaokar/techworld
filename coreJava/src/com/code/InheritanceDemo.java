package com.code;

/**
 * Created by Amit on 08/09/16.
 */
class Parent {
    String str1 = "Parent Str1";
    String str2 = "Parent Str2";

    public void print1() {
        System.out.println("From Parent print1");
    }

    public void print2() {
        System.out.println("From Parent print2");
    }

    public static void print4() {
        System.out.println("From Parent Static print4");
    }
}

class Child extends Parent {
    String str2 = "Child Str2";
    String str3 = "Child Str3";

    public void print2() {
        System.out.println("From Child print2");
    }

    public void print3() {
        System.out.println("From Child print3");
    }

    public static void print4() {
        System.out.println("From Child Static print4");
    }
}

public class InheritanceDemo {
    public static void main(String args[]) {
        Parent p = new Child();
        p.print1();
        p.print2();
        Parent.print4();
        System.out.println(p.str1);
        System.out.println(p.str2);
// static methods are not overridden
        Child.print4();
    }
}
