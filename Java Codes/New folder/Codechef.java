/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int x=sc.nextInt();
		    String S=sc.next();
		    boolean flag=true;
		    
            int count=1;
		    for(int i=0;i<x-1;i++){
		        if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i' || S.charAt(i)=='o' || S.charAt(i)=='u'){
		            
		            flag = true;
		            i=i+3;
		            count=1;
		        }
		        else{
		            if(count==5){
		                flag=false;
		                break;
		            }
		            count++;
		        }
		    }
		    if(flag==true){
		        System.out.println("YES");  
		    }else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
