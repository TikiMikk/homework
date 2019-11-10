package acb.week1.Task4;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nomer 1: ");
        int a = sc.nextInt();
        System.out.print("Nomer 2: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(a + b);
        }
    }
}
