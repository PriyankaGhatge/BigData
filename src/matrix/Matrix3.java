package matrix;

import java.util.Scanner;

public class Matrix3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int m1[][] = new int[3][3];
		int m2[][] = new int[3][3];
		int sum = 0;
		int mul[][] = new int[3][3];

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
				for (int c = 0; c < 3; c++) {
					sum = sum + m1[a][c] * m2[c][b];
				}
				mul[a][b] = sum;
				sum = 0;
			}
		}

		System.out.println("The product of 2 matrices is :");

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {

				System.out.print(mul[a][b] + "\t");
			}
			System.out.println();
		}
	}
}
