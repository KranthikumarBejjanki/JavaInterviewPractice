package arrayBasedLogics;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Missing 3
        int n = arr.length + 1; // n should be the length of full sequence

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}

