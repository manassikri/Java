import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
      int bin = scn.nextInt();
      int dec = bin2Dec(bin);
      System.out.println(dec);
   }
   
   public static int bin2Dec(int num){
      int retVal = 0;
      
           int l,r=0;
	         while(num!=0){
	         l=num%10;
	         retVal=retVal+l*(int)(Math.pow(2, r));
	         r++;
	         num=num/10;
	         }

      return retVal;
   }
}
