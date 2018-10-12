import java.io.*;
import java.util.*;

public class Solution {

 public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
String str = scn.nextLine();
System.out.println(Consecutive(str));

	}
public static String Consecutive(String str){
	StringBuilder sb=new StringBuilder();
	int i;
	
	for(i=0;i<str.length()-1;i++){
		char ch = str.charAt(i);
		/*if(i==0){
		sb.append(ch);
		}*/
		if((str.charAt(i)!=str.charAt(i+1))){
			sb.append(str.charAt(i));
		}
	}
	
	sb.append(str.charAt(str.length()-1));
	return sb.toString();
}

}
