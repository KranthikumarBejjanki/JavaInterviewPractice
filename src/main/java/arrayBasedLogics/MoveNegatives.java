package arrayBasedLogics;

import java.util.Arrays;

public class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}
