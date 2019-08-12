package additional;

import java.util.Scanner;

public class home15 {
    public static void main(String[] args) {

        Scanner sv = new Scanner(System.in);

        System.out.println("Площа круга");
        int s1 = sv.nextInt();
        System.out.println("Площа квадрата");
        int s2 = sv.nextInt();
        double r, a, d;

        r = Math.sqrt(s1 / 3.14);
        a = Math.sqrt(s2);
        d = r * 2;

        if (d <= a) {
            System.out.println("Круг вписаний в квадрат");
        } else {
            System.out.println("Круг описує квадрат");
        }
        System.out.println(d);
        System.out.println(a);
    }
}