package Task4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ведіть число");
        int nomber = sc.nextInt();

        if (nomber % 7 == 0) {
            System.out.println(nomber * 2);
        }
    }
}
