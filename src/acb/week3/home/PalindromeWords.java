package acb.week3.home;


public class PalindromeWords {
    private int age;
     String name;
    public static void main(String[] args) {

        String word = "Stats";
        boolean palindrome = isPalindrome(word);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String word) {
        char[] split = word.toCharArray();
        String revers = "";
        for (int i = 0; i < word.length(); i++) {
            revers = split[i] + revers;
        }
        return word.equalsIgnoreCase(revers);

    }

    private static boolean isPalindrome2(String word) {
        char[] split = word.toCharArray();




        return true;
    }

}


