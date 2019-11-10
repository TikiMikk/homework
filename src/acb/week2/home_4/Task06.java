package acb.week2.home_4;

import acb.week2.method.ArrayUtils;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write size");
        int size = in.nextInt();
        System.out.println("Write minrange");
        int minRange = in.nextInt();
        System.out.println("Write maxrange");
        int maxRange = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size,minRange,maxRange);
        ArrayUtils.printArr(mas);

        int sumMasNums = 0;
        double average = 0;

        for (int i = 0; i < mas.length ; i++) {
            sumMasNums += mas[i];
        }

        average = sumMasNums/size;

        System.out.println(average);

    }
}