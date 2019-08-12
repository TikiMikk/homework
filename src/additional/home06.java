package additional;

import java.util.Scanner;

public class home06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Швидкість: ");
        int a = sc.nextInt();
        System.out.print("Відстань: ");
        int b = sc.nextInt();

        int c = b / a;

        System.out.println("Час: " + c);
    }
}