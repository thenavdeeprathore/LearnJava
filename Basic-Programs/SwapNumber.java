/**
 * @author: Navdeep
 * Swap Numbers with Third Variable
 * Swap Numbers without Third Variable
 */
public class SwapNumber {

    public static void main(String[] args) {
        withThirdVariable(7, 11);
        withoutThirdVariable(10, 20);
    }

    public static void withThirdVariable(int x, int y) {
        System.out.println("Before swapping \nfirst number: "+x+"\nsecond number: "+y);
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping\nfirst number: "+x+"\nsecond number: "+y);
    }

    public static void withoutThirdVariable(int x, int y) {
        System.out.println("Before swapping \nfirst number: "+x+"\nsecond number: "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping\nfirst number: "+x+"\nsecond number: "+y);
    }
}