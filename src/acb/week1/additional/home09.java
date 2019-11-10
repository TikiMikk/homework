package acb.week1.additional;

import java.util.Scanner;

public class home09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Вага: ");
        double kg = sc.nextDouble();
        System.out.print("Ріст: ");
        double cm = sc.nextDouble();

        double koef = kg / (cm*cm);
        koef = koef * 10000;
        System.out.println(koef);

        if (koef >= 21 && koef <= 24) {
            System.out.println("Normal");
        } else if (koef < 21) {
            System.out.println("need more eat");
        } else {
            System.out.println("Stop eat!!!");
        }
        System.out.println(koef);

    }
}