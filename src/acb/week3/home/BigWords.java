package acb.week3.home;

import java.util.Scanner;

public class BigWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String[] arr = name.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length ; i++) {
            if ( arr[i].length() > 0) {
                String first = arr[i].substring(0,1).toUpperCase();
                arr[i] = first + arr[i].substring(1);
               sb.append(arr[i]).append(" ");

            }
        }

        String s = sb.toString();
        System.out.print(s);
    }
}
