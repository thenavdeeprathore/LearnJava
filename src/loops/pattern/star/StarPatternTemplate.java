package loops.pattern.star;

import java.util.Scanner;

/**
 * Follow these 2 base templates for any PATTERN (*, #, $, same number 1, same character A) programs
 *
 * 1) Increasing Triangle
 *          Logic:
 *          ======
 *          Rows = 1 to n
 *          Cols = 1 to i
 * 2) Decreasing Triangle
 *          Logic:
 *          ======
 *          Rows = 1 to n
 *          Cols = i to n
 */

public class StarPatternTemplate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern Size: ");
        int n = sc.nextInt();

        System.out.println("========== Increasing Triangle ==========");
        increasingTrianglePattern(n);
        System.out.println("========== Decreasing Triangle ==========");
        decreasingTrianglePattern(n);
    }

    /*
        Increasing Triangle:
        *
        * *
        * * *
        * * * *
        * * * * *

        Logic:
        ======
        Rows = 1 to n
        Cols = 1 to i
     */
    private static void increasingTrianglePattern(int n) {
        // rows
        for (int i = 1; i <= n; i++) {
            // columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Decreasing Triangle:
        * * * * *
        * * * *
        * * *
        * *
        *

        Logic:
        ======
        Rows = 1 to n
        Cols = i to n
     */
    private static void decreasingTrianglePattern(int n) {
        // rows
        for (int i = 1; i <= n; i++) {
            // columns
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
