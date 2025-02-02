package stringBasedLogics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "this is a test and this is a test";
        findDuplicateWords(str);
    }

    public static void findDuplicateWords(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

