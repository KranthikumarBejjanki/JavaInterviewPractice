package leetCodeLogics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToEnd {
    static Scanner sc = new Scanner(System.in);
    static int size = sc.nextInt();
    static int[] numbers = new int[size];

    public static void main(String[] args) {

        System.out.println("Enter the " + size+ " Elements");
        for(int i=0; i<size;i++){
            numbers[i] = sc.nextInt();
        }
        moveZeroes(numbers, size);
        moveZeroesUsingArray(numbers,size);
        System.out.println(Arrays.toString(numbers));
    }
    public static void moveZeroes(int[] nums, int size){
        int j = 0; // Pointer for placing non-zero elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++; // Move j forward
            }
        }
    }

    //another approach (not recommended)
    public static void moveZeroesUsingArray(int[] nums , int size){
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length ; i++){
            if(nums[i]!=0){
                result[i] = nums[i];
            }
        }

        for(int i=0; i<nums.length;i++){
            nums[i] = result[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
