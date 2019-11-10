package acb.week1.additional;

import java.util.Scanner;

public class home11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Число від 1 до 99: ");
        int kop = sc.nextInt();

        if (kop % 10 == 0 || kop >= 10 && kop <= 20){
            System.out.println(kop + " Копеек");
        } else if (kop % 10 == 1) { // % == 1     != 11
            System.out.println(kop + " Копейка");
        } else if (kop % 10 >= 2 && kop % 10 < 5) {
            System.out.println(kop + " Копейки");
        } else if (kop % 10 >= 5 && kop % 10 <= 9){
            System.out.println(kop + " Копеек");
        }
    }
}