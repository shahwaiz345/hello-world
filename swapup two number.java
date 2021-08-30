package com.company;
import java.util.Scanner;
public class tutorial_8 {
    public static void main(String[] args) {
        int a ,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        c = a;
        a=b;
        b=c;
        System.out.println("the value of a is");
        System.out.println(a);
        System.out.println("the value of b is");
        System.out.println(b);
    }
}
