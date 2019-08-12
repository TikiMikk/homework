package Task4;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nomer 1: ");
        int a = sc.nextInt();
        System.out.print("Nomer 2: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("true");
            if (a > b)
                System.out.println(a / b);
            else
                System.out.println(b / a);

        } else {
            System.out.println("false");
            if (a > b)
                System.out.println(a / b + " i " + a % b);
            else
                System.out.println(b / a + " i " + b % a);

        }
    }
}