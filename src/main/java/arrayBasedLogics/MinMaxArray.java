package arrayBasedLogics;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 50};

        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

