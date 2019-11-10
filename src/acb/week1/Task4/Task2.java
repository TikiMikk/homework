package acb.week1.Task4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nomber 1: ");
        int a = sc.nextInt();
        System.out.print("Nomber 2: ");
        int b = sc.nextInt();
        System.out.print("Nomber 3: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Всі числа рівні");

        }   else if (a >= b && a >= c && b >= c) {
            System.out.println("Найбільше значення: " + a);
            System.out.println("Найменше значення: " + c);
        }   else if (a >= b && a >= c && c >= b) {
            System.out.println("Найбільше значення: " + a);
            System.out.println("Найменше значення: " + b);

        }   else if (b >= a && b >= c && a >= c) {
            System.out.println("Найбільше значення: " + b);
            System.out.println("Найменше значення: " + c);
        }   else if (b >= a && b >= c && c >= a) {
            System.out.println("Найбільше значення: " + b);
            System.out.println("Найменше значення: " + a);

        }   else if (c >= a && c >= b && a >= b) {
            System.out.println("Найбільше значення: " + c);
            System.out.println("Найменше значення: " + b);
        }   else if (c >= a && c >= b && b >= a) {
            System.out.println("Найбільше значення: " + c);
            System.out.println("Найменше значення: " + a);
        }
    }
}