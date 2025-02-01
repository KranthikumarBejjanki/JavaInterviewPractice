package stringBasedLogics;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //using array of characters
        char[] characters = input.toCharArray();
        for(int i=characters.length-1; i>=0; i--) {
            System.out.print(characters[i]);
        }

        //.........................
        System.out.println();
        //.........................


        //using StringBuffer inbuilt method
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());

        //.........................
        System.out.println();
        //.........................

        //using String Builder
        StringBuilder sb1 = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            sb1.append(input.charAt(i));
        }
        System.out.print(sb1.toString());


        //using java8

    }


}
