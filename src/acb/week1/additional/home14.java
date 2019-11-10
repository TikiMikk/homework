package acb.week1.additional;

import java.util.Scanner;

public class home14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть 6-и значне число: ");
        int nomber = sc.nextInt();

        int a = (nomber / 100000) % 10;
        int b = (nomber / 10000) % 10;
        int c = (nomber / 1000) % 10;
        int d = (nomber / 100) % 10;
        int f = (nomber / 10) % 10;
        int e = nomber % 10;

        if (a + b + c == d + f + e) {
            System.out.println("Congratulations");
        }
    }
}
