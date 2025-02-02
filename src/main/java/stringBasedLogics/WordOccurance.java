package stringBasedLogics;

public class WordOccurance {
    public static void main(String[] args) {
        String str = "this is a test and this is a test";
        String wordToFind = "test";
        int count = countWordOccurrence(str, wordToFind);
        System.out.println("Word '" + wordToFind + "' appears " + count + " times.");
    }

    public static int countWordOccurrence(String str, String wordToFind) {
        String[] words = str.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToFind)) {
                count++;
            }
        }
        return count;
    }
}

