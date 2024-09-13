package com.example;

public class Tochka {
    private double x;
    private double y;

    public Tochka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tochka{" + "x=" + x + ", y=" + y + '}';
    }
}