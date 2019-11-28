package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1, s2;

        System.out.println("Enter the 1st String : ");
        s1 = scanner.nextLine();

        System.out.println("Enter the 2nd String : ");
        s2 = scanner.nextLine();

	    char[] lcs=LCS.longestCommonSub(s1,s2);

        System.out.println("Result : ");
        for(int i = 0; i <= lcs.length-2; i++)
            System.out.print(lcs[i]);
    }
}
