
import java.util.Scanner;

public class Stairs {

	public static void main(String[] args) {
		int row = 1, col;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i ;
		while (row <= n) {
			i=1;
			while (i <= n - row) {
				System.out.print(" ");
				i++;
			}
			col = 1;
			while (col <= row) {
				System.out.print("#");
				
				col++;
			}
			System.out.print("\n");
			row++;
		}
	}

}
