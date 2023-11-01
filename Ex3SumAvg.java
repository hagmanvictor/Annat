import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - ex2ifwhile
 * - IW5LoopAndAHalf in particular.
 *
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here
        int i = 0;
        // -- Input (and bookkeeping)
        while (true) {
            out.print("Input positive int > ");
            i = i + sc.nextInt();
            out.println(i);
            if (i < 0) {
            break;
            }
           }
            out.println(i);
            out.print("Loop ended");

        // -- Process---


        // -- Output ----

    }

}
