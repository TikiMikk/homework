package acb.week3.home;

public class LengthWords {
    public static void main(String[] args) {
        String words = "I am stupid bitch and Ivan pisun gazirovanuy boy";
        String[] arr = words.split(" ");
        int constanta = 0;
        int nomberArr = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length() > constanta) {
                constanta = arr[i].length();
                nomberArr = i;
            }

        }
        System.out.println(arr[nomberArr]);
    }
}
