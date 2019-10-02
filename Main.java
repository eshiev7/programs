package ru.nsu.home;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Rectangle kek1 = new Rectangle(3, 2, 6, 4);
        System.out.println(kek1.getArea());
        System.out.println(kek1.getInfo());
        kek1.changeX(4);
        System.out.println(kek1.getInfo());
        System.out.println(kek1.getArea());
        kek1.size(1,2);
        System.out.println(kek1.getInfo());
        System.out.println(kek1.getArea());
        System.out.println("-----------------------------------------");
        Square kek2 = new Square(2,3, 2);
        System.out.println(kek2.getArea());
        System.out.println(kek2.getInfo());
        kek2.changeX(4);
        System.out.println(kek2.getInfo());
        System.out.println(kek2.getArea());
        kek2.size(1);
        System.out.println(kek2.getInfo());
        System.out.println(kek2.getArea());
        System.out.println("-----------------------------------------");
        Circle kek3 = new Circle(5,3, 2);
        System.out.println(kek3.getArea());
        System.out.println(kek3.getInfo());
        kek3.changeX(4);
        System.out.println(kek3.getInfo());
        System.out.println(kek3.getArea());
        kek3.size(1);
        System.out.println(kek3.getInfo());
        System.out.println(kek3.getArea());
    }
}
