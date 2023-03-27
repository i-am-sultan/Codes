import java.util.*;
class odd_even {
    static void segregateEvenOdd(int arr[], int n) { //static keyword allows us to call the method without creating the object of the class.
        // code here
        int even_count=0,odd_count=0;
        int brr[]=new int[n];
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println(even_count);
        System.out.println(odd_count);
        int x=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                brr[even_count]=arr[i];
                even_count++;
            }else{
                brr[x]=arr[i];
                x++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(brr[i]);
        }
    }
    public static void main(String[] args) { //
        //can main method be private?
        int arr[]={12,34, 45, 9, 8, 90, 3};
        int n=arr.length;
        segregateEvenOdd(arr,n);
    }
}