import java.util.Scanner;

public class q2 {
    static int[] rotate(int arr[],int n,int k){
        int ans[]=new int[n];
        if(k>n){
            k=k%n;
        }
        for(int i=0;i<k;i++){
            ans[i]=arr[n-k+i];
        }
        int index=0;
        for(int i=k;i<n;i++){
            ans[i]=arr[index++];
        }
        return ans;
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
