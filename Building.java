package com.architect;
import java.io.*;
public class Building
{
    // Returns count of possible ways for N sections
    static int countWays(int N)
    {
        // Base case
        if (N == 1)
            return 4; // 2 for one side and 4 for two sides



        // Initialize countB and countS for one side
        int countB=1, countS=1, prev_countB, prev_countS;

        // Use the above recursive formula for calculating
        // countB and countS using previous values
        for (int i=2; i<=N; i++)
        {
            countB = countB;
            countS = countS;

            countS = countB + countS;
            countB = countS;
        }

        // Result for one side is sum of ways ending with building
        // and ending with space
        int result = countS + countB;

        // Result for 2 sides is square of result for one side
        return (result*result);
    }


    public static void main(String args[])
    {
        int N = 3;
        System.out.println("Count of ways for "+ N+" sections is "
                +countWays(N));
    }

}
