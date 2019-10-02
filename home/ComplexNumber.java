package ru.nsu.home;

public class ComplexNumber {

    private double a;
    private double b;

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //---------------Increase--------------------


    public ComplexNumber increase(ComplexNumber k){
        this.a = this.a + k.getA();
        this.b = this.b + k.getB();
        return this;
    }
    //---------------Reduce---------------------


    public ComplexNumber reduce(ComplexNumber k) {
        this.a = this.a - k.getA();
        this.b = this.b - k.getB();
        return this;
    }
    //---------------Multiply--------------------
    public ComplexNumber multiply(ComplexNumber k){
        double aa;
        aa = this.a * k.getA() - this.b * k.getA();
        this.b = this.a * k.getB() + k.getA() * this.b;
        this.a = aa;
        return this;
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

    @Override
    public String toString() {
        return "ComplexNumbers{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}