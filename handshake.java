import java.util.Scanner;

public class Handshake {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int l =scn.nextInt();
		int p=1;
		while(p<=l){
		int n = scn.nextInt();
		int i=n-1;
		int s=0;
		while(i!=0){
			s=s+i;
			i--;
		}
		System.out.println(s);
		p++;
	}
	}
}
