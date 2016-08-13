package com.code.program;

/**
 * Created by Amit on 08/13/16.
 */
public class Pyramid {

    public static void printOddPyramid(int rows){
        for(int i=0;i<rows;i++) {
            if(i%2==0) {
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printOddPyramid(5);
    }
}
