package loops.pattern.character;

import java.util.Scanner;

/**
 * Follow these base templates for any CHARACTER PATTERN programs
 *
 * Important Points:
 * -----------------
 * 2 separate logics will be required and make sure you never mix Pattern with Character
 *
 *      PATTERN + CHARACTER
 *
 * PATTERN base logic:
 * 1) Increasing Triangle
 *
 *
 * CHARACTER base logic:
 * 1) Incrementing rows
 * 2) Decrementing rows
 * 3) Incrementing rows by 2
 * 4) Decrementing rows by 2
 * 5) Odd Rows Value = A and Even Rows Value = B
 * 6) Incrementing cols
 * 7) Decrementing cols
 * 8) Floyd Triangle
 */
public class IncreasingTriangleCharacterPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern Size: ");
        int n = sc.nextInt();

        System.out.println("========== Increasing Triangle - Incrementing Rows ==========");
        increasingTriangleIncrementingRows(n);
        System.out.println("========== Increasing Triangle - Decrementing Rows ==========");
        increasingTriangleDecrementingRows(n);
        System.out.println("========== Increasing Triangle - Incrementing Rows by 2 ==========");
        increasingTriangleIncrementingRowsBy2(n);
        System.out.println("========== Increasing Triangle - Decrementing Rows by 2 ==========");
        increasingTriangleDecrementingRowsBy2(n);
        System.out.println("========== Increasing Triangle - Odd and Even Value Rows ==========");
        increasingTriangleOddAndEvenRows(n);
        System.out.println("========== Increasing Triangle - Incrementing Cols ==========");
        increasingTriangleIncrementingColumns(n);
        System.out.println("========== Increasing Triangle - Decrementing Cols ==========");
        increasingTriangleDecrementingColumns(n);
        System.out.println("========== Floyd Triangle ==========");
        floydTriangle(n);
    }

    /*
    Increasing Triangle - Incrementing Rows
        A
        B B
        C C C
        D D D D
        E E E E E

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Incrementing Rows / Outer Loop
            -> a='A'; a++
            -> Typecast and print: (char)a
     */
    private static void increasingTriangleIncrementingRows(int n) {
        // row
        for (int i=1, a='A'; i<=n; i++, a++) {
            // column
            for (int j=1; j<=i; j++) {
                System.out.print((char)a+" ");
            }
            System.out.println();
        }
    }

    /*
    Increasing Triangle - Decrementing Rows
        5
        4 4
        3 3 3
        2 2 2 2
        1 1 1 1 1

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Decrementing Rows / Outer Loop
            -> a='E'; a--
            -> Typecast and print: (char)a
     */
    private static void increasingTriangleDecrementingRows(int n) {
        // row
        for (int i=1, a='E'; i<=n; i++, a--) {
            // column
            for (int j=1; j<=i; j++) {
                System.out.print((char)a+" ");
            }
            System.out.println();
        }
    }

    /*
    Increasing Triangle - Incrementing Rows By 2
        0
        2 2
        4 4 4
        6 6 6 6
        8 8 8 8 8

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Incrementing Rows / Outer Loop
            -> a=0; a+=2
     */
    private static void increasingTriangleIncrementingRowsBy2(int n) {
        // row
        for (int i=1, a='A'; i<=n; i++, a+=2) {
            // column
            for (int j=1; j<=i; j++) {
                System.out.print((char)a+" ");
            }
            System.out.println();
        }
    }

    /*
    Increasing Triangle - Decrementing Rows By 2
        10
        8 8
        6 6 6
        4 4 4 4
        2 2 2 2 2

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Decrementing Rows / Outer Loop
            -> a=0; a+=2
     */
    private static void increasingTriangleDecrementingRowsBy2(int n) {
        // row
        for (int i=1, a='I'; i<=n; i++, a-=2) {
            // column
            for (int j=1; j<=i; j++) {
                System.out.print((char)a+" ");
            }
            System.out.println();
        }
    }

    /*
    Increasing Triangle - Odd and Even Value Rows
        1
        0 0
        1 1 1
        0 0 0 0
        1 1 1 1 1

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Odd Rows Even Rows
            -> if (i%2==0) condition inside inner loop / column
     */
    private static void increasingTriangleOddAndEvenRows(int n) {
        // row
        for (int i=1; i<=n; i++) {
            // column
            for (int j=1; j<=i; j++) {
                if (i%2==0) {
                    // Even Rows
                    System.out.print("Y ");
                } else {
                    // Odd Rows
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    /*
    Increasing Triangle - Incrementing Cols
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Incrementing Cols / Inner Loop
            -> int a=1; defined just before inner loop
            -> a++
     */
    private static void increasingTriangleIncrementingColumns(int n) {
        // row
        for (int i=1; i<=n ; i++) {
            // column
            int a='A';
            for (int j=1; j<=i; j++) {
                System.out.print((char)a++ +" ");
            }
            System.out.println();
        }
    }

    /*
    Increasing Triangle - Decrementing Cols
        5
        5 4
        5 4 3
        5 4 3 2
        5 4 3 2 1

        PATTERN: Increasing Triangle
            -> Rows: 1 to n
            -> Cols: 1 to i
        NUMBER: Decrementing Cols / Inner Loop
            -> int a=5; defined just before inner loop
            -> a--
     */
    private static void increasingTriangleDecrementingColumns(int n) {
        // row
        for (int i=1; i<=n ; i++) {
            // column
            int a='E';
            for (int j=1; j<=i; j++) {
                System.out.print((char)a-- +" ");
            }
            System.out.println();
        }
    }


    /*
    Floyd Triangle
        1
        2 3
        4 5 6
        7 8 9 10
     */
    private static void floydTriangle(int n) {
        int a='A';
        // row
        for (int i=1; i<=n; i++) {
            // column
            for (int j=1; j<=i; j++) {
                System.out.print((char)a++ +" ");
            }
            System.out.println();
        }
    }
}
