import java.security.Key;
import java.util.*;

public class hashmap{
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap <Integer,Integer> mymap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            mymap.put(i,arr[i]);
        }
        System.out.println(mymap);

        //search
        if(mymap.containsValue(100)){
            System.out.println("Value is present in the hashmap");
        }else{
            System.out.println("Value is not present.");
        }
    }
}