package com.statement;

import java.util.Arrays;

public class InputDemo {
    public static void main(String[] args) {
        System.out.println(args.length);
        for(int i=0;i< args.length;i++) {
            System.out.println(args[i]);
        }

        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
