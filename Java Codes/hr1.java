import java.util.*;
public class hr1{
    public static void main(String args[]){
        //SCHOOL
        String str ="SCHOOL";
        int n = str.length();
        System.out.println(n);
        
		for(int i=str.length()-1;i>=0;i--){  //i=5,4,3,2,1,0
            for(int j=i;j<str.length();j++){ //for i=5, j=5 5<6
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}