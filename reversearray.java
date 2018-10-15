import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int N=s.nextInt();
       int[] arr=new int[N];
       int i;
       for(i=0;i<N;i++){
    	   arr[i]=s.nextInt();
       }
        int[] rev =ReverseArray(arr);
for (int val : rev) {
			System.out.println(val);
		}    
    }
    public static int[] ReverseArray(int[] arr){
        		int temp;
        int left =0;
        int right=arr.length-1;
		while (left <= right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}
		return arr;
    }
}
