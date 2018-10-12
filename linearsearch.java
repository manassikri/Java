import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    	public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        int N=s.nextInt();
		        int[] arr =new int[N]; 
		        int i;
		        for(i=0;i<N;i++){
		            arr[i]=s.nextInt();
		        }
		        int M =s.nextInt();
		        System.out.println(linearSearch(arr,M));
		       }
	 public static int linearSearch(int[] arr,int M){
		 int j;
		 boolean flag=false;
		       for(j=0;j<arr.length;j++){
		           if(arr[j]==M){
		               flag=true;
		               break;
		           }
		       }
		       if(flag==true){
		    	   return j;
		       }else {
		    	   return -1;
		    	   
		    	   
		       }
		       
		    	   
		       }
		           
		           
		   }
