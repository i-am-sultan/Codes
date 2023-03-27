//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class MedianOfTwoArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        System.out.println(Arrays.toString(b));

        double res = new GFG().medianOfArrays(n, m, a, b);
        System.out.println("The Median is : ");
        System.out.println(res);
    }
}
// } Driver Code Ends

// User function Template for Java

class GFG {
    static double medianOfArrays(int n, int m, int a[], int b[]) {
        int size = n + m;
        double temp[] = new double[size];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                temp[k] = a[i];
                i++;
                k++;
            } else {
                temp[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            temp[k] = b[j];
            j++;
            k++;
        }
        if (size % 2 == 0) {
            double res = (double) ((temp[size / 2] + temp[size / 2 - 1]) / 2);
            return res;
        }
        double res = (double) (temp[size / 2]);
        return res;
    }
}