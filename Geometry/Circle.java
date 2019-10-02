package ru.nsu.home;

public class Circle extends Figure{

    private int r;
    private int x1;
    private int y1;

    public  Circle(int r, int x1, int y1){
        this.r = r;
        this.x1 = x1;
        this.y1 = y1;
    }
    //---------------Area-------------------------
    public double getArea(){
        return Math.PI * Math.pow(this.r, 2);
    }
    //---------------Movement----------------------
    public void changeX(int x){
        this.x1 += x;
    }

    public void changeY(int y){
        this.y1 += y;
    }
    //---------------ChangeSize---------------------
    public void size(int r){
        this.r += r;
    }
    //---------------Getter-------------------------
    public String getInfo(){
        return "X1: " + this.x1 + ", " + "Y1: " + this.y1 + ", " + "Radius: " + this.r;
    }
}
