package com.inheritance;

class Super {
//    Super() {
//        System.out.println("Super class default-constructor");
//    }
    Super(String name){
        System.out.println("Super class arg-constructor"+name);
    }
}
class Sub extends Super {
//    Sub() {
//        System.out.println("Sub class default-constructor");
//    }
    Sub(String location){
        super("Chennai");
        System.out.println("Sub class arg-constructor"+location);
    }
}


public class ThirdProgram {
    public static void main(String[] args) {
        Sub sub = new Sub("Chennai");
    }
}
