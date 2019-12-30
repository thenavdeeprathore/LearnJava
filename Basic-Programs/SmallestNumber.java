/**
 * @author: Navdeep
 * Smallest Number without using comparison operator
 */
public class SmallestNumber {

    public static void main(String[] args) {
        System.out.println("Smallest Number is: "+smallest(11, 7, 21));
    }

    public static int smallest(int x, int y, int z) {
        int c = 0;
        while (x!=0 && y!=0 && z!=0) {
            x--;
            y--;
            z--;
            c++;
        }
        return c;
    }
}