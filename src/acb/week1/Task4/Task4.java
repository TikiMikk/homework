package acb.week1.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Число з плаваючою точкою");
        double a = sc.nextDouble();

        if (a > 0 && a < 1) {
            System.out.println("Число знаходиться в діапазоні");
        } else {
            System.out.println("Мімо діапазона");
        }
    }

}
