package arrayBasedLogics;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 2};

        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

