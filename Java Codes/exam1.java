import java.util.*;

public class exam1{
    public int minOperations(int[] A) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with 0 sum and index -1
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (map.containsKey(sum)) {
                count += i - map.get(sum);
            } else {
                map.put(sum, i);
            }
        }
       return count;
    }
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int A[]={1,-1,1};
    
    exam1 a1=new exam1();
    int res=a1.minOperations(A);
    System.out.println(res);
    sc.close();
    
    }
}