package acb.week2.method;

public class ArrayUtils {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateMas(int size, int minRange, int maxRange) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (maxRange - minRange)) + minRange;
        }
        return mas;
    }


    public static int genRandomNum(int range) {
        return (int) (Math.random() * range);
    }


    public static int[] getRandomMasEvenNum(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int random = genRandomNum(range);

            mas[i] = random % 2 == 0 ? random : random + 1;

        }
        return mas;
    }

    public static String convert(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ",";
        }
        return res;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13)
                i++;
            else
                sum += nums[i];
        }
        return sum;
    }
}
