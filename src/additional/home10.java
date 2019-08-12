package additional;

import java.util.Scanner;

public class home10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Week: ");
        byte week = sc.nextByte();
        System.out.print("Time: ");
        int time = sc.nextInt();

        int money = time + 1;

        if (week >= 1 && week <= 5){
            System.out.println(money);
        } else if (week >= 6 && week <= 7){
            money = money - (money / 20);
            System.out.println(money);
        } else {
            System.out.println("error");
        }

    }
}