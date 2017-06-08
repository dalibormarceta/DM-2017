/**
 * Created by marceta on 6/6/17.
 */

public class Palindrome {
    public static void main(String[] args) {
        // write your code here

        String palindrome = "aAbB";
        boolean result = isPalindrome1(palindrome);
        System.out.println( palindrome + " is " + "Palindrome 1 " + result);
        result = isPalindrome2(palindrome);
        System.out.println( palindrome + " is " + "Palindrome 2 " + result);

        palindrome = "1b2a3A4B5";
        result = isPalindrome1(palindrome);
        System.out.println( palindrome + " is " + "Palindrome 1 " + result);
        result = isPalindrome2(palindrome);
        System.out.println( palindrome + " is " + "Palindrome 2 " + result);

    }

    public static boolean isPalindrome1 (String inputText) {
        if (inputText == null || inputText.length() == 0){
            return true;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            if (Character.isAlphabetic(inputText.charAt(i))){
                builder.append(Character.toUpperCase(inputText.charAt(i)));
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
        if (inputText == null || inputText.length() == 0){
            return true;
        }

        int i=lskip(inputText,0)
                ,j=rskip(inputText,inputText.length()-1);
        while (i<j){
            if (Character.toUpperCase(inputText.charAt(i)) != Character.toUpperCase(inputText.charAt(j)))
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
