import java.util.*;
public class q2v2 {
    static void reverse(int arr[],int start, int end){
        int temp=0;
        while(end>start){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=arr[start];
            start++;
            end--;
        }
        for(int i=start;i<end;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static int[] rotate(int arr[],int n,int k){
        if(k>n){
            k=k%n;
        }
        System.out.println("First Rotation: ");
        reverse(arr, 0, n-k-1);
        System.out.println("Second Rotation: ");
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }  
    public static void main(String[] args) {
        System.out.println("Enter no of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter rotation no: ");
        int k=sc.nextInt();
        int ans[]=rotate(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
