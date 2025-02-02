package stringBasedLogics;

public class ReverseEachword {
    public static void main(String[] args) {
        String str = "this is a test";
        String reversed = reverseWords(str);
        System.out.println("Reversed words: " + reversed);
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = reverseString(word);
            result += reversedWord + " ";  // Concatenate reversed word
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

