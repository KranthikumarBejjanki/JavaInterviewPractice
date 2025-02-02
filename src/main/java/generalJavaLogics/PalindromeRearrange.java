package generalJavaLogics;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromeRearrange {
    public static boolean canRearrangeAsPalindrome(int num) {
        String str = String.valueOf(num);
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count digit occurrences
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Count digits with odd frequencies
        int oddCount = 0;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false; // More than one odd count means it can't be a palindrome
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (canRearrangeAsPalindrome(num)) {
            System.out.println(num + " can be rearranged into a palindrome.");
        } else {
            System.out.println(num + " cannot be rearranged into a palindrome.");
        }
    }
}

