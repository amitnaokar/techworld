package com.code.program;

/**
 * Created by Amit on 08/13/16.
 */
public class Factorial {

    public static int calcFactorialNormal(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static int calcFactorialUsingRecursion(int n) {
        if (n > 0)
            return n * calcFactorialNormal(n - 1);
        else
            return 1;
    }

    public static void main(String args[]) {
        System.out.println(Factorial.calcFactorialNormal(5));
        System.out.println(Factorial.calcFactorialUsingRecursion(5));
    }

}
