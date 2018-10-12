import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int row = 1, i, l, val, col;
		while (row <= n) {
			i = 1;
			while (i <= n - row) {
				System.out.print("\t");
				i++;
			}
			col = 1;
			val = row;
			while (col <= row) {
				System.out.print(val+"\t");
				val++;
				col++;
			}
			l = 2 * row - 2;
			col = 1;
			while (col <= row - 1) {
				System.out.print(l+"\t");
				l--;
				col++;
			}
			System.out.print("\n");
			row++;

		}


    }
}
