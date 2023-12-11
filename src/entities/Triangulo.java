package entities;

public class Triangulo {
    private double a;
    private double b;
    private double c;

    public double area() {
        double p = (getA() + getB() + getC()) / 2.0;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;

    }
}
