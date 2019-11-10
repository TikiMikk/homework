package acb.week3.home;

public class DeleteCloneWords {
    public static void main(String[] args) {

        String words = "He he boy ";
        deleteAllReplyWords(words);
        deleteDuplicateWords("hi my my name ivan ivan");
    }


    public static  void deleteDuplicateWords(String words){
        String[] arr = words.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (!result.contains(arr[i])) {
                result = result + " " + arr[i];
            }
        }
        System.out.println(result);
    }

    private static void deleteAllReplyWords(String words) {
        String[] arr = words.split(" ");
        String newstr = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    count++;
                }
            }
            if (count == 1){
                newstr = newstr + " " + arr[i];
            }
        }
        System.out.println(newstr);
    }
}
