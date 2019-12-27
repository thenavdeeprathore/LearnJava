/**
 * @author : Navdeep
 * DataTypes Program 02:
 * Declare and initialize Non-Primitive Data Types
 */
public class DataTypes_02 {

    public static void main(String[] args) {
        dataType();
    }

    public static void dataType() {
        String s = "AutoTechX";
        int[] Array1_int = { 1, 2, 3 };
        char[] Array2_char = { 'a', 'b', 'c' };
        String[] Array3_String = { "Navdeep", "Singh", "Rathore" };
        boolean[] Array4_boolean = { true, false };

        System.out.println("String: " + s);
        System.out.println("Array_int: " + Array1_int[0]);
        System.out.println("Array_char: " + Array2_char[2]);
        System.out.println("Array_String: " + Array3_String[1]);
        System.out.println("Array_boolean: " + Array4_boolean[1]);
    }
}