package stringBasedLogics;

public class ReverseAlternateWords {
    public static void main(String[] args) {
        String str = "this is a test string";
        String result = reverseAlternateWords(str);
        System.out.println("Reversed alternate words: " + result);
    }

    public static String reverseAlternateWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                String reversedWord = reverseString(words[i]);
                result += reversedWord + " "; // Concatenate reversed word
            } else {
                result += words[i] + " "; // Add the word as is
            }
        }

        return result.trim(); // Remove the trailing space
    }

    public static String reverseString(String word) {
        char[] charArray = word.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);  // Convert the char array back to a string
    }
}

