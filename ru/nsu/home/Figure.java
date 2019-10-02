package ru.nsu.home;

public abstract class Figure {
    private String name;
    public Figure(String name){
        this.name = name;
    }
    public abstract double getArea();
    public abstract String getInfo();
    public abstract void changeX(int x);
    public abstract void changeY(int y);
    public String getName() {
        return name;
    }
}
