package acb.week2.home_4;

import acb.week2.method.ArrayUtils;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write sizeMas");
        int size = in.nextInt();
        System.out.println("Write minrange");
        int minRange = 25;
        System.out.println("Write maxrange");
        int maxRange = 75;


        int[] mas = ArrayUtils.generateMas(size, minRange, maxRange);
        int[] arr = ArrayUtils.generateMas(size, minRange, maxRange);
        ArrayUtils.printArr(mas);
        ArrayUtils.printArr(arr);

        int pairedMas = 0;
        int pairedArr = 0;

        for (int i = 0; i < mas.length ; i++) {

            if (mas[i] % 2 == 0)
                pairedMas++;
            if (arr[i] % 2 == 0)
                pairedArr++;
        }
        if (pairedMas >= pairedArr) {
            System.out.println("The first array has more paired numbers");
            System.out.println(pairedMas);
        }
        else {
            System.out.println("The second array has more paired numbers");
            System.out.println(pairedArr);
        }

    }
}
