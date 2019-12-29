/**
 * @author: Navdeep
 * Even Odd Program
 */
public class EvenOdd {
    public static void main(String[] args) {
        userInputEvenOdd(0);
        userInputEvenOdd(1);
        userInputEvenOdd(2);
        userInputEvenOdd(5);
        userInputEvenOdd(10);
        usingArrayWithForLoopEvenOdd();
        usingArrayWithWhileLoopEvenOdd();
        usingArrayWithDoWhileLoopEvenOdd();
    }

    public static void userInputEvenOdd(int number) {
        if (number%2==0 && number!=0) {
            System.out.println("Even Number - "+number);
        } else {
            System.out.println("Odd Number - "+number);
        }
    }

    public static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void usingArrayWithForLoopEvenOdd() {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]%2==0) {
                System.out.println("Even Number: "+numbers[i]);
            } else {
                System.out.println("Odd Number: "+numbers[i]);
            }
        }
    }

    public static void usingArrayWithWhileLoopEvenOdd() {
        int i=0;
        while (i<numbers.length) {
            if (numbers[i]%2==0) {
                System.out.println("Even Number: "+numbers[i]);
            } else {
                System.out.println("Odd Number: "+numbers[i]);
            }
            i++;
        }
    }

    public static void usingArrayWithDoWhileLoopEvenOdd() {
        int i=0;
        do {
            if (numbers[i]%2==0) {
                System.out.println("Even Number: "+numbers[i]);
            } else {
                System.out.println("Odd Number: "+numbers[i]);
            }
            i++;
        } while (i<numbers.length);
    }
}