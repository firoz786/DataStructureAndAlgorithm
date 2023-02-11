package com.dsa;

import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n= scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            while(i!=0)
            {
                System.out.print("*\t");
                i--;
            }
        }
        scn.close();

    }
}