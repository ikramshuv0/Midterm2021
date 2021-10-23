package problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String k = "KAYAK";
        if (isPalindrome(k)) {
            System.out.println("\""+k+"\" is Palindrome");
        }
        else {
            System.out.println("\""+k+"\" is not palindrome");
        }

    }

    public static boolean isPalindrome(String string) {

        StringBuilder palindrome = new StringBuilder();
        int wordLength = string.length();

        for (int i = 0; i < wordLength; i++) {
            palindrome.append(string.charAt(wordLength - 1 - i));
        }
        String revPalindrome = new String(palindrome);

        return string.matches(revPalindrome);
    }
}