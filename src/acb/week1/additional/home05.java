package acb.week1.additional;

import java.util.Scanner;

public class home05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nomber 1: ");
        int a = sc.nextInt();
        System.out.print("Nomber 2: ");
        int b = sc.nextInt();
        System.out.print("Nomber 3: ");
        int c = sc.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("є спільні пари");
        }
    }
}