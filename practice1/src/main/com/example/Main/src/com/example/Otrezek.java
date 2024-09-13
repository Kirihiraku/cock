package com.example;

public class Otrezek {
    private Tochka point1;
    private Tochka point2;

    public Otrezek(Tochka point1, Tochka point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Tochka getPoint1() {
        return point1;
    }

    public void setPoint1(Tochka point1) {
        this.point1 = point1;
    }

    public Tochka getPoint2() {
        return point2;
    }

    public void setPoint2(Tochka point2) {
        this.point2 = point2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) +
                Math.pow(point2.getY() - point1.getY(), 2));
    }
}
