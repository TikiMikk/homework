package acb.week1.additional;

import java.util.Scanner;

public class home07 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Номер місяця");
        byte n = sv.nextByte();

        if (n == 1) {
            System.out.println("Січень");
        } else if (n == 2) {
            System.out.println("Лютий");
        } else if (n == 3) {
            System.out.println("Березень");
        } else if (n == 4) {
            System.out.println("Квітень");
        } else if (n == 5) {
            System.out.println("Травень");
        } else if (n == 6) {
            System.out.println("Червень");
        } else if (n == 7) {
            System.out.println("Липень");
        } else if (n == 8) {
            System.out.println("Серпень");
        } else if (n == 9) {
            System.out.println("Вересень");
        } else if (n == 10) {
            System.out.println("Жовтень");
        } else if (n == 11) {
            System.out.println("Листопад");
        } else if (n == 12) {
            System.out.println("Грудень");

        } else {
            System.out.println("Такого місяця не існує");
        }

    }
}