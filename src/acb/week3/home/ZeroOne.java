package acb.week3.home;

public class ZeroOne {
    public static void main(String[] args) {
        String compination = "101110001010";
        String[] arr = compination.split("1");
        int start = 0;
        int end = 0;

        char[] charArr = compination.toCharArray();

        for (int i = 0; i < compination.length() - 1; i++) {
            if (charArr[i] == '0') {
                if (i == 0) {
                    start = i;
                    end = i;
                }

            }

        }

    }
}