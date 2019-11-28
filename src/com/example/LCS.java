package com.example;

public class LCS {

    public static char[] longestCommonSub(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();
        int[][] L = new int[m + 1][n + 1];

        // To make the the two string into table manner to check the lcs number
        for (int i=1; i <= m; i++)
        {
            for (int j=1; j <= n; j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {         // To check the same character
                    L[i][j] = ++ L[i-1][j-1];                   // If it is same then L[i][j] pre increased the value by one
                } else {
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);   // To assign the previous value
                }
//                System.out.print(L[i][j]);
            }
//            System.out.println();
        }

        // Get the value of maximum equals in the lcs number
        int index = L[m][n];

        char[] lcs = new char[index+1];
        

        // To assign the character to the char array that got same in the lcs number
        int x = m, y = n;
        while (x > 0 && y > 0)
        {
            if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
                lcs[index - 1] = s1.charAt(x - 1);  // store the character from last to first
                x--;                                // decrease the row
                y--;                                // decrease the column
                index--;
            } else if (L[x - 1][y] > L[x][y - 1]) {     // If the previous row and next row diagonally greater than next row
                x--;                                // row will be decreased
            } else {
                y--;                                // Otherwise column will be decreased
            }
        }
        return lcs;
    }

}
