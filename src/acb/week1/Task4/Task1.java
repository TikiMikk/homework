package acb.week1.Task4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Time from 0 to 24");
        int hour = sc.nextInt();

        if (hour >= 9 && hour <= 18) {
            System.out.println("Я на работе");
        } else {
            System.out.println("Я отдыхаю");
        }
    }
}
