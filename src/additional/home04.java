package additional;

import java.util.Scanner;

public class home04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Швидкість км/год: ");
        int km = sc.nextInt();
        System.out.print("Швидкість м/сек: ");
        int m = sc.nextInt();

        km = (km * 1000) / 3600;

        if (km > m) {
            System.out.println("Більше перше значення");
        } else {
            System.out.println("Більше друге значення");
        }
        System.out.println(km);
        System.out.println(m);
    }
}