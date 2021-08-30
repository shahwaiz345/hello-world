package com.company;

import java.util.Scanner;

public class tutorial_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius");
        double radius = sc.nextDouble();
        System.out.println("enter the value of height");
        double height = sc.nextDouble();
        double volume = (22*radius*radius*height)/(3*7);
        System.out.println("your volume is");
        System.out.println(volume);
    }
}
//22*r*r*h/3*7