package acb.week1.additional;

import java.util.Scanner;

public class home13 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.print("A: ");
        int a = sv.nextInt();
        System.out.print("B: ");
        int b = sv.nextInt();
        System.out.print("C: ");
        int c = sv.nextInt();

        if (a + b + c > 0 ){
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = 0;
            b = 0;
            c = 0;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}