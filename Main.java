package com.ksu.ru;

public class Main {

    public static void main(String[] args) {
        ComplexNumbers kek1 = new ComplexNumbers(4,4);
        System.out.println(kek1.getA());
        System.out.println(kek1.getB());
        System.out.println(kek1.getAll());
        kek1.increase(8,3);
        System.out.println(kek1.getAll());
        kek1.reduce(7,25);
        System.out.println(kek1.getAll());
        kek1.multiply(4,-5);
        System.out.println(kek1.getAll());
    }
}
