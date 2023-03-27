import java.util.Scanner;

public class insertionSort {
    public static void insertionSort(int arr[], int n)
   {
      //code here
      for(int i=1;i<n;i++){
          int current = arr[i];
          int j = i-1; //0,1
          while(j>=0  && arr[j]>current)
          {
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=current;
        }

    }
    static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        insertionSort(arr, n);
        print(arr,n);
    }
}
