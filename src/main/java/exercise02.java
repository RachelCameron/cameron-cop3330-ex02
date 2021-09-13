/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String str = input.nextLine();
        int length = str.length();
        System.out.printf("%s has %d characters.", str, length);
    }
}