package acb.week3.home;

public class Util {
    public static void main(String[] args) {

//        String word = LettersMagicA("Allah akbar");
//        System.out.println(word);

        String alLah_akBar = "AlLah akBar";
        String word2 = AllLettersMagic(alLah_akBar);
        System.out.println(alLah_akBar);
        System.out.println(word2);
    }


    // шо таке юнікод (кожна буква в юнікоді має своє число)
    public static String LettersMagicA(String words) {

        String[] arr = words.split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("a")) {
                arr[i] = "A";
                result.append(arr[i]);
            } else if (arr[i].equals("A")) {

            } else if (!arr[i].equalsIgnoreCase("a")) {
                result.append(arr[i]);
            }
        }
        return result.toString();
    }

    public static String AllLettersMagic(String words) {
        char[] word = words.toCharArray();
        StringBuilder result = new StringBuilder();
        String convert = "";

        for (int i = 0; i < word.length; i++) {

             if (word[i] >= '\u0041' && word[i] <= '\u005A') {
                convert = Character.toString(word[i]);
                result.append(convert.toLowerCase());

            }else if (word[i] >= '\u0061' && word[i] <= '\u007A') {
                convert = Character.toString(word[i]);
                result.append(convert.toUpperCase());
            } else {
                 result.append(word[i]);
             }


        }
        return result.toString();
    }
}
