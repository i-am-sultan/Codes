import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        System.out.println("Enter no of rows or columns for a square matrix: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The sum of the diagonal elements are: ");
        int l2r_diagonal=0;
        int r2l_diagonal=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    l2r_diagonal=l2r_diagonal+arr[i][j];
                }
                if(i+j==n-1){
                    r2l_diagonal=r2l_diagonal+arr[i][j];
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("l2r_diagonal: "+l2r_diagonal);
        System.out.println("r2l_diagonal: "+r2l_diagonal);
    }
}