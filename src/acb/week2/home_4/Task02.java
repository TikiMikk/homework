package acb.week2.home_4;

import acb.week2.method.ArrayUtils;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write size");
        int size = in.nextInt();
        System.out.println("Write minrange");
        int minRange = in.nextInt();
        System.out.println("Write maxrange");
        int maxRange = in.nextInt();


        int[] mas = ArrayUtils.generateMas(size, minRange, maxRange);
        ArrayUtils.printArr(mas);

        int imin = 0;
        int imax = 0;
        int buffer = imin;


        for (int i = 0; i < mas.length; i++) {
            if (mas[imax] < mas[i])
                imax = i;

                if(mas[imin] > mas[i])
                    imin = i;
            }
        buffer = mas[imin];

        mas[imin] = mas[imax];
        mas[imax] = buffer;
        ArrayUtils.printArr(mas);

    }
}