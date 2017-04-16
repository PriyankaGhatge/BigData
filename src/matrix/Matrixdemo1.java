package matrix;

import java.util.Scanner;

public class Matrixdemo1 {

	int matrix[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);

	void create_matrix() {

		System.out.println("Enter elements for a 3x3 matrix:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

	}

	void display() {

		System.out.println("The matrix created is :");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Matrixdemo1 obj = new Matrixdemo1();
		obj.create_matrix();
		obj.display();

	}

}
