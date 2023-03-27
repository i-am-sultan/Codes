import java.util.Scanner;

//1 2 3 4 5
// d=1: 5 4 3 2 1
class first{
    public static void rotate(int []arr,int nor){
        while(nor>0){
            for(int i=0;i<arr.length;i++){
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("How many times do you want to rotate the array: ");
        int nor=sc.nextInt();
        rotate(arr,nor);
    }
}