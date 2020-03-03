package com.company;
import java.util.Scanner;

public class Main {
    public static boolean checking(int v0, int x0, int t0, int a1, int a2) {
        int v = v0;
        int s = x0;
        int t = t0;
        int A1 = a1;
        int A2 = a2;
        boolean flag = false;
        int maximumDistance = (A1 * (t * t) / 2) + v * t;
        int minimumDistance = v * t - (A2 * (t * t) / 2);

        if (s < minimumDistance){
            return flag = true;
        }
        if (s > maximumDistance){
            return flag = false;
        }
        if (s > minimumDistance && s < maximumDistance){
            return flag = true;
        }
        return flag;

        //if the screen says TRUE, then it means the car should ACCELERATE, if it says FALSE, it means the car should STOP
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocity of the car: ");
        int v0 = sc.nextInt();
        System.out.print("Distance till the intersection: ");
        int x0 = sc.nextInt();
        System.out.print("Duration of the yellow light: ");
        int t0 = sc.nextInt();
        System.out.print("Magnitude of car’s constant positive acceleration: ");
        int a1 = sc.nextInt();
        System.out.print("Magnitude of car’s constant negative acceleration: ");
        int a2 = sc.nextInt();
        System.out.print(checking(v0, x0, t0, a1, a2));
    }
}
