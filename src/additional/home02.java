package additional;

import java.util.Scanner;

public class home02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nomber 1: ");
        int a = sc.nextInt();
        System.out.print("Nomber 2: ");
        int b = sc.nextInt();
        System.out.print("Nomber 3: ");
        int c = sc.nextInt();

        if (a > 0) {
            a = a * a * a;
        } else {
            a = 0;
        } if (b > 0) {
            b = b * b * b;
        } else {
            b = 0;
        } if (c > 0) {
            c = c * c * c;
        } else {
            c = 0;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}