package matrix;

import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m1[][] = new int[3][3];
		int m2[][] = new int[3][3];
		int sum[][] = new int[3][3];

		System.out.println("Enter elements for first 3x3 matrix");

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				m1[a][b] = sc.nextInt();
			}
		}

		System.out.println("Enter elements for second 3x3 matrix");
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				m2[a][b] = sc.nextInt();
			}
		}

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				sum[a][b] = m1[a][b] + m2[a][b];
			}
		}

		System.out.println("The sum of 2 matrices is :");

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				System.out.print(sum[a][b] + "\t");
			}
			System.out.println();
		}

	}
}
