package ru.nsu.home;

public class Square extends Figure{

    private int x1;
    private int y1;
    private int a;
    private int x2;
    private int y2;


    public Square(int x1, int y1, int a){
        this.x1 = x1;
        this.y1 = y1;
        this.a = a;
        this.x2 = this.x1 + this.a;
        this.y2 = this.y1 + this.a;
    }

    //---------------Name-------------------------
    public String getName(){
        return "квадрат";
    }
    //---------------Area-------------------------
    public double getArea(){
        return this.a * this.a;
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
    public void size(int a){
        this.x2 += a;
        this.y2 += a;
        this.a += a;
    }
//----------------Getter----------------------------
public String getInfo(){
    return "X1: " + this.x1 + ", " +
            "Y1: " + this.y1 + ", " +
            "X2: " + this.x2 + ", " +
            "Y2: " + this.y2;
}
}
