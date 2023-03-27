//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class missing_number {
    static int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        for(int i=0;i<n-1;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<n-1;i++){
            if(array[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={7,8,4,1,2,3,5};
        int n=8;
        int res=MissingNumber(array,n);
        System.out.println(res);
    }
}