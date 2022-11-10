package com.jetbrains.debugging;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String input = (scn.nextLine());

        String newString = "";

        for (int i = 0; i < input.length(); i++) {
            char newChars = input.charAt(i);
            newString = newChars + input;
        }
        System.out.println("Reversed word: " + newString);


        // refactored version
        //StringBuilder stringBuilder = new StringBuilder(input);
        //StringBuilder reversed = stringBuilder.reverse();
        //System.out.println("Reversed word: " + reversed);
    }



}


