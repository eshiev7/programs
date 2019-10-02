package ru.nsu.home;

public class Main {

    public static void main(String[] args) {
        ComplexNumber kek1 = new ComplexNumber(4,4);
        ComplexNumber kek2 = new ComplexNumber(1,2);
        System.out.println(kek1.getA());
        System.out.println(kek1.getB());
        System.out.println(kek1.getAll());
        kek1.increase(kek2).reduce(kek2).multiply(kek2);
        System.out.println(kek1);

    }
}