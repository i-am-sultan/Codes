// package Arrays;
import java.util.*;

public class BinarySearch {
	public static void main(String []args) {
		int key=12,index=-1;
		int arr[]= {10,11,12,13,14,15};
		int start=0,end=arr.length-1,mid;
		mid=(start+end)/2;
		while(start<=end) {
			mid=(start+end)/2;
			if(key==arr[mid]) {
				index=mid;
				break;
			}
			else if(key<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		if(index>-1) {
			System.out.println(key+" is present at index "+index);
		}
		else {
			System.out.println(key+" is not present in the array.");
		}
		
	}
}
