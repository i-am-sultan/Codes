/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stock
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    for(int j=0;j<n;j++){
		        int amt = sc.nextInt();
		        if(amt <= k){
		            System.out.println(1);
		            k = k-amt;
		        }
		        else{
		            System.out.println(0);
		        }
		    }
		}
	}
}
