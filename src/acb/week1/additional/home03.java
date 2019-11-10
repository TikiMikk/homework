package acb.week1.additional;

import java.util.Scanner;

public class home03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть 3-ох значне число: ");
        short nomber = sc.nextShort();

        int a = (nomber / 100) % 10;
        int b = (nomber / 10) % 10;
        int c = nomber % 10;

        if (a == b && b == c) {
            System.out.println("Всі однакові");
        } else if (a == b || b == c || a == c) {
            System.out.println("Є спільні числа");
        }
    }
}