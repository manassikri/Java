import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

      int sb = scn.nextInt();
      int db = scn.nextInt();
      int sn = scn.nextInt();
      int dn = any2Any(sb, db, sn);
      System.out.println(dn);
   }

   public static int any2Dec(int num, int base){
      int retVal = 0;
int l,r=0;
       while(num!=0){
           l=num%10;
           retVal=retVal+l*(int)(Math.pow(base,r));
           r++;
           num=num/10;
       }
           

      return retVal;
   }
   
   public static int dec2Any(int num, int base){
      int retVal = 0;

     int l,r=0;
       while(num!=0) {
           l=num%base;
           retVal=retVal+l*(int)(Math.pow(10,r));
           r++;
           num=num/base;
       }
      
      return retVal;
   }

   public static int any2Any(int from, int to, int num) {
      int retVal =0;
       int x = any2Dec(num,from);
       retVal = dec2Any(x,to);

      return retVal;
   }
}
