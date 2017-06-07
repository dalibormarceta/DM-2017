/**
 * Created by marceta on 6/6/17.
 */

public class Day1 {
    public static void main(String[] args) {
        // write your code here

        String palindrome = "aAbB";
        boolean result = isPalindrome2(palindrome);
        System.out.println( palindrome + " is " + "Palindrome " + result);

        palindrome = "baAB";
        result = isPalindrome2(palindrome);
        System.out.println( palindrome + " is " + "Palindrome " + result);

    }

    public static boolean isPalindrome1 (String inputText) {
        if (inputText == null) {
            return true;
        }
        if (inputText.length() == 0){
            return true;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputText.length()-1; i++) {
            if (Character.isAlphabetic(inputText.charAt(i))){
                builder.append(inputText.charAt(i));
            }
        }
        String newText = builder.toString();

        for (int i=0; i<newText.length()-1;i++){
            if (newText.charAt(i) != newText.charAt(newText.length()-i-1))
                return false;
        }

        return true;

    }

    public static boolean isPalindrome2(String inputText) {
        if (inputText == null) {
            return true;
        }
        if (inputText.length() == 0){
            return true;
        }

        int i=lskip(inputText,0)
                ,j=rskip(inputText,inputText.length()-1);
        while (i<j){
            if (inputText.charAt(i) != inputText.charAt(j))
                return false;

            i=lskip(inputText,i+1);
            j=rskip(inputText,j-1);

        }

        return true;

    }

    private static int rskip (String S, int j){
        while (!(Character.isAlphabetic(S.charAt(j))))
            j--;
        return j;
    }

    private static int lskip (String S, int i){
        while (!(Character.isAlphabetic(S.charAt(i))))
            i++;
        return i;
    }

}
