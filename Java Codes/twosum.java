import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int a[]={2,3,4,2};
        int n=4;
        int k=6;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==k){
                    System.out.println(i+""+j);
                }
            }
        }
    }
}
