import java.io.*;
import java.util.*;

public class substring_compare {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";
        
        for(int i=0;i<=s.length()-k;i++){
            if((s.substring(i,i+k).compareTo(smallest))<=0){
                smallest = s.substring(i,i+k);
            }
            if((s.substring(i, i+k).compareTo(largest))>=0){
                largest = s.substring(i, i+k);
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        int size=sc.nextInt();
        System.out.println(getSmallestAndLargest(inp,size));
    }
}