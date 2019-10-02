package ru.nsu.home;

public class ComplexNumbers {

    private double a;
    private double b;

    public ComplexNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumbers(double a, double b) {
        this.a = a;
        this.b = b;
    }
//---------------Increase--------------------
    public void increaseReal(double a){
        this.a = this.a + a;
    }

    public void increaseImaginary(double b){
        this.b = this.b + b;
    }

    public void increase(double a, double b){
        this.a = this.a + a;
        this.b = this.b + b;
    }
//---------------Reduce---------------------
    public void reduceReal(double a){
        this.a = this.a - a;
    }

    public void reduceImaginary(double b){
        this.b = this.b - b;
    }

    public void reduce(double a, double b) {
        this.a = this.a - a;
        this.b = this.b - b;
    }
//---------------Multiply--------------------
    public void multiply(double a, double b){
        double aa;
        aa = this.a * a - this.b * b;
        this.b = this.a * b + a * this.b;
        this.a = aa;
    }
//---------------Getter----------------------
    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public String getAll(){
        if(b > 0){
            return this.a + "+" + this.b + "i";
        }
        if(b == 0){
            return this.a + "";
        }
        else{
            return this.a + "" + this.b + "i";
        }
    }
}
