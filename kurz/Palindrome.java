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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static boolean isPalindrome(String word) {

        char[] original = word.toCharArray();
        {

            char[] reversed = new char[original.length];

            for (int i = original.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = original[i];
        }
            return word.equals(new String(reversed));
        }
    }
}



