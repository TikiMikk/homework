package week2.home_4;

import org.w3c.dom.ls.LSOutput;
import week2.method.ArrayUtils;
import java.util.Scanner;

public class Task07 {
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

        int sumMas1 = 0;
        int sumMas2 = 0;
        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < mas.length/2 ; i++) {
            sumMas1 += mas[i];
        }
        for (int i = mas.length/2; i < mas.length ; i++) {
            sumMas2 += mas[i];
        }

        average1 = sumMas1/(size/2);
        average2 = sumMas2/(size/2);

        if (average1 >= average2) {
            System.out.println("The average value of the first half is greater");
            System.out.println(average1);
        }
        else {
            System.out.println("The average value of the second half is greater ");
            System.out.println(average2);
        }
    }
}