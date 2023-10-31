import static java.lang.System.*;

import java.util.Scanner;

public class ArithmeticSequence {
	public static void main(String[] args) {
		new ArithmeticSequence().program();
	}

	void program() {
		int LENGTH = 10;
//		int[] arr = {1, 2, 4, 8};
		int[] sequence = new int[LENGTH];
		Scanner sc = new Scanner(in);
		out.print("Input 10 integers, separated by space: ");
		for (int i = 0; i < LENGTH; i++) {
			sequence[i] = sc.nextInt();
		}
		int delta = sequence[1] - sequence[0];
		boolean isArithmetic = true;
		for (int i = 1; i < LENGTH; i++) {
			if (sequence[i] - sequence[i - 1] != delta) {
				isArithmetic = false;
				break;
			}
		}
		out.println("Is arithmetic: " + isArithmetic);
	}
}