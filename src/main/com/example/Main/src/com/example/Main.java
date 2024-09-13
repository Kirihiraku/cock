package com.example;

public class Main {
    public static void main(String[] args) {
        Tochka point1 = new Tochka(1, 2);
        Tochka point2 = new Tochka(4, 6);
        Otrezek otrezek = new Otrezek(point1, point2);

        System.out.println("Длина отрезка: " + otrezek.calculateLength());
    }
}