package Task4;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nomer 1: ");
        int a = sc.nextInt();
        System.out.print("Nomer 2: ");
        int b = sc.nextInt();

        if (a + b >= 11 && a + b <= 19) {
            System.out.println(a + b);
        }
    }
}