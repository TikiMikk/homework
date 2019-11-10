package acb.week1.additional;

import java.util.Scanner;

public class home01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Сторона a: ");
        int a = sc.nextInt();
        System.out.print("Сторона b: ");
        int b = sc.nextInt();
        System.out.print("Сторона c: ");
        int c = sc.nextInt();
        byte d = 2;

        if (Math.pow(a,d) == Math.pow(b,d) + Math.pow(c,d) ||
                Math.pow(b,d) == Math.pow(a,d) + Math.pow(c,d) ||
                Math.pow(c,d) == Math.pow(a,d) + Math.pow(b,d))  {
            System.out.println("Трикутник прямокутний");
        } else {
            System.out.println("І шо ето такоє?");
        }
    }
}
