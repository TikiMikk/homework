package additional;

import java.util.Scanner;

public class home08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Вартість покупки: ");
        int a = sc.nextInt();

        int skidka = a / 10;

        if (a > 1000) {
            a = a - skidka;
        }
        System.out.println(a);
    }
}