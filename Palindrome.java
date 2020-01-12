public class Palindrome {


    public static void main(String[] args) {

        var wort = "forest";

        String[] words = {"forrest", "madam", "clean", "racecar"};

        for (var word : words) {

            if (isPalindrome(word)) {

                System.out.printf("%s is a not a palindrome%n", word);
            } else {
                System.out.printf("%s is not a palindrome%n", word);
            }
        }
    }

    public static boolean isPalindrome(String word) {

        boolean isPalindrome = true;

        int len = word.length();

        int i = 0;

        while (i < len / 2) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                isPalindrome = false;

            }
            i++;
        }
        return isPalindrome;
    }
}
