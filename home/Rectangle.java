package ru.nsu.home;

public class Rectangle extends Figure {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int a;
    private int b;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.a = Math.abs(this.x2 - this.x1);
        this.b = Math.abs(this.y2 - this.y1);
    }
//---------------Name-------------------------
    public String getName(){
        return "прямоугольник";
    }
//---------------Area-------------------------
    public double getArea(){
        return this.a * this.b;
    }
//---------------Movement----------------------
    public void changeX(int x){
        this.x1 += x;
        this.x2 += x;
    }

    public void changeY(int y){
        this.y1 += y;
        this.y2 += y;
    }
//---------------ChangeSize---------------------
    public void size(int a, int b){
        this.x2 += a;
        this.y2 += b;
        this.a = Math.abs(this.x2 - this.x1);
        this.b = Math.abs(this.y2 - this.y1);
    }
//---------------Getter-------------------------
    public String getInfo(){
         return "X1: " + this.x1 + ", " +
                 "Y1: " + this.y1 + ", " +
                 "X2: " + this.x2 + ", " +
                 "Y2: " + this.y2;
    }
}
