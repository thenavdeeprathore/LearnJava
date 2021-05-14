package loops.pattern.star;

import java.util.Scanner;

/**
 * Follow these 2 base templates from loops/pattern/star/StarPatternTemplate.java
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

public class StarPatternPrograms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern Size: ");
        int n = sc.nextInt();

        System.out.println("========== Right Triangle ==========");
        rightTriangle(n);
        System.out.println("========== Left Triangle ==========");
        leftTriangle(n);
        System.out.println("========== Hill Pattern / Pyramid ==========");
        hillPattern(n);
        System.out.println("========== Reverse Hill Pattern / Reverse Pyramid ==========");
        reverseHillPattern(n);
        System.out.println("========== Diamond Pattern ==========");
        diamondPattern(n);
        System.out.println("========== Butterfly Pattern ==========");
        butterflyPattern(n);
    }

    /*
        Right Triangle:
                  *
                * *
              * * *
            * * * *
          * * * * *


        Logic:
        ======
        1) Decreasing Triangle --> space
        2) Increasing Triangle --> *
     */
    private static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // 1) Decreasing Triangle --> space
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            // 2) Increasing Triangle --> *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Left Triangle:
          * * * * *
            * * * *
              * * *
                * *
                  *


        Logic:
        ======
        1) Increasing Triangle --> space
        2) Decreasing Triangle --> *
     */
    private static void leftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // 1) Increasing Triangle --> space
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            // 2) Decreasing Triangle --> *
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Hill Pattern:
                  *
                * * *
              * * * * *
            * * * * * * *
          * * * * * * * * *


        Logic:
        ======
        1) Decreasing Triangle --> space
        2) Increasing Triangle --> *
        3) Increasing Triangle --> *
        NOTE: merge middle line of 2) and 3)
     */
    private static void hillPattern(int n) {
        for (int i=1; i<=n; i++) {
            // 1) Decreasing Triangle --> space
            for (int j=i; j<=n; j++) {
                System.out.print("  ");
            }
            // 2) Increasing Triangle --> *
            // NOTE: merge middle line of 2) and 3) by using j<i
            for (int j=1; j<i; j++) {
                System.out.print("* ");
            }
            // 3) Increasing Triangle --> *
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Reverse Hill Pattern:
          * * * * * * * * *
            * * * * * * *
              * * * * *
                * * *
                  *


        Logic:
        ======
        1) Increasing Triangle --> space
        2) Decreasing Triangle --> *
        3) Decreasing Triangle --> *
        NOTE: merge middle line of 2) and 3)
     */
    private static void reverseHillPattern(int n) {
        for (int i=1; i<=n; i++) {
            // 1) Increasing Triangle --> space
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            // 2) Decreasing Triangle --> *
            // NOTE: merge middle line of 2) and 3) by using j<n
            for (int j=i; j<n; j++) {
                System.out.print("* ");
            }
            // 3) Decreasing Triangle --> *
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Diamond Pattern:
                  *
                * * *
              * * * * *
            * * * * * * *
          * * * * * * * * *
            * * * * * * *
              * * * * *
                * * *
                  *


        Logic:
        ======
        1) Hill Pattern
        2) Reverse Hill Pattern
        NOTE: remove one row less in outer for loop in 1) Hill Pattern --> i<n
     */
    private static void diamondPattern(int n) {
        // 1) Hill Pattern
        // NOTE: remove one row less in outer for loop in 1) Hill Pattern --> i<n to make it perfect diamond shape
        for (int i=1; i<n; i++) {
            // 1) Decreasing Triangle --> space
            for (int j=i; j<=n; j++) {
                System.out.print("  ");
            }
            // 2) Increasing Triangle --> *
            // NOTE: merge middle line of 2) and 3) by using j<i
            for (int j=1; j<i; j++) {
                System.out.print("* ");
            }
            // 3) Increasing Triangle --> *
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2) Reverse Hill Pattern
        for (int i=1; i<=n; i++) {
            // 1) Increasing Triangle --> space
            for (int j=1; j<=i; j++) {
                System.out.print("  ");
            }
            // 2) Decreasing Triangle --> *
            // NOTE: merge middle line of 2) and 3) by using j<n
            for (int j=i; j<n; j++) {
                System.out.print("* ");
            }
            // 3) Decreasing Triangle --> *
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        Butterfly Pattern:
        *                 *
        * *             * *
        * * *         * * *
        * * * *     * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * *     * * * *
        * * *         * * *
        * *             * *
        *                 *

        Logic:
        ======
        outer row loop
        1) Increasing Triangle (*) & Decreasing Triangle (space)
        2) Decreasing Triangle (space) & Increasing Triangle (*)

        outer row loop
        3) Decreasing Triangle (*) & Increasing Triangle (space)
        4) Increasing Triangle (space) & Decreasing Triangle (*)

     */
    private static void butterflyPattern(int n) {
        for (int i=1; i<=n; i++) {
            // 1) Increasing Triangle (*) & Decreasing Triangle (space)
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // NOTE: merge middle line of 1) and 2) by using j<n
            for (int j=i; j<n; j++) {
                System.out.print("  ");
            }
            // 2) Decreasing Triangle (space) & Increasing Triangle (*)
            // NOTE: merge middle line of 1) and 2) by using j<n
            for (int j=i; j<n; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++) {
            // 3) Decreasing Triangle (*) & Increasing Triangle (space)
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            // NOTE: merge middle line of 1) and 2) by using j<n
            for (int j=1; j<i; j++) {
                System.out.print("  ");
            }
            // 4) Increasing Triangle (space) & Decreasing Triangle (*)
            // NOTE: merge middle line of 1) and 2) by using j<n
            for (int j=1; j<i; j++) {
                System.out.print("  ");
            }
            for (int j=i; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
