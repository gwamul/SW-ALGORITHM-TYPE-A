package SWEA_D2;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA9940_순열1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);

			String check = "Yes";
			for (int i = 0; i < N; i++) {
				if (arr[i] != i + 1) {
					check = "No";
				}
			}
			System.out.println("#" + tc + " " + check);
		}
	}

}
