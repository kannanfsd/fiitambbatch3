package com.fundamental;

public class ReturnValue {
    public String getNameInWords(int number) {
        String response = "Unknown";
        if(number == 1) {
            response = "One";
        } else if(number == 2) {
            response = "Two";
        } else if(number == 3) {
            response = "Three";
        }
        return response;
    }
    public static void main(String[] args) {
        ReturnValue returnValue = new ReturnValue();
        System.out.println(returnValue.getNameInWords(1));
        System.out.println(returnValue.getNameInWords(2));
        System.out.println(returnValue.getNameInWords(3));
        System.out.println(returnValue.getNameInWords(4));
    }
}
