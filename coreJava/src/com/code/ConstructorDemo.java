package com.code;

/**
 * Created by Amit on 21/11/2015.
 */
public class ConstructorDemo {
    String msg;
    private  ConstructorDemo(){
        this.msg = "Hello World";
    }

    public static void main(String args[]){
        ConstructorDemo demo = new ConstructorDemo();
        System.out.println(demo.msg);
    }
}
