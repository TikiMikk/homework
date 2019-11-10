package acb.week2.home_4;

import acb.week2.method.ArrayUtils;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write size");
        int size = in.nextInt();
        System.out.println("Write minrange");
        int minRange = in.nextInt();
        System.out.println("Write maxrange");
        int maxRange = in.nextInt();

        int mas[] = ArrayUtils.generateMas(size, minRange, maxRange);
        ArrayUtils.printArr(mas);

        System.out.println("Number");
        int number = in.nextInt();
        int amountOfNumbers = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % number == 0)
                amountOfNumbers++;
        }
        System.out.print("Amount of number: ");
        System.out.print(amountOfNumbers);
    }

}