package ru.nsu.home;

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
        System.out.println("-----------------------------------------");
        Figure[] kek = new Figure[3];
        kek[0] = kek1;
        kek[1] = kek2;
        kek[2] = kek3;
        for(int i = 0; i <= kek.length - 1; i++){
            System.out.println(kek[i].getArea());
        }
    }
}
