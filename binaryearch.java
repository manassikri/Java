import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int m = scn.nextInt();

		int l = binary(arr, m);
		System.out.println(l);

	}

	public static int binary(int[] arr, int m) {
		int beg = 0;
		boolean flag = false;
		int end = arr.length - 1;
		int mid=(beg+end)/2;
		while (beg< end) {
			mid = (beg + end) / 2;
			if (m > arr[mid]) {
				beg = mid+1;
				end = arr.length - 1;
			} else if (m < arr[mid]) {
				end = mid-1;
				beg = 0;
			} else {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			return mid;
		} else {
			return -1;
		}

	}

}
