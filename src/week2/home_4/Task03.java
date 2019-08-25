package week2.home_4;

import org.w3c.dom.ls.LSOutput;
import week2.method.ArrayUtils;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Write sizeMas");
        int size = in.nextInt();
        System.out.println("Write minrange");
        int minRange = in.nextInt();
        System.out.println("Write maxrange");
        int maxRange = in.nextInt();


        int[] mas = ArrayUtils.generateMas(size, minRange, maxRange);
        int[] arr = ArrayUtils.generateMas(size, minRange, maxRange);
        ArrayUtils.printArr(mas);
        ArrayUtils.printArr(arr);

        for (int i = 0; i < mas.length ; i++) {
            arr[i] = mas[i];
        }
        System.out.println("Result");
        ArrayUtils.printArr(mas);
        ArrayUtils.printArr(arr);

    }
}