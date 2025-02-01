package stringBasedLogics;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringPrserveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        revreseString(input);
        reverseUsingExtraArray(input);
    }
    public static void revreseString(String s){
        char[] chars = s.toCharArray();
        int left =0;
        int right = chars.length-1;

        //skip spaces
        while(left<right){
            if(chars[left]==' '){
                left++;
                continue;
            }
            if(chars[right]==' '){
                right--;
                continue;
            }
            //swap characters
            char temp = chars[left];
            chars[left]= chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(chars));
    }

    //another approach
    public static void reverseUsingExtraArray(String s1){
        char[] chars =s1.toCharArray();
        ArrayList<Character> letters = new ArrayList<>();

        // add the characters to list from end
        for(int i=chars.length-1 ; i>=0 ; i--){
            if(chars[i]!=' '){
                letters.add(chars[i]);
            }
        }

        //adding back the list data to array
        int index=0;
        for(int i=0; i<chars.length ; i++){
            if(chars[i]!=' '){
                chars[i] = letters.get(index++);
            }
        }
        System.out.println(new String(chars));
    }
}
