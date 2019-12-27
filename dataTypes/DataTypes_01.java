/**
 * @author : Navdeep
 * DataTypes Program 01:
 * Declare and initialize both Primitive and Non-primitive data types
 */
public class DataTypes_01 {

    public static void main(String[] args) {
        dataType();
    }

    public static void dataType() {
        int x = 10;
        char ch = 'x';
        String s = "AutoTechX";
        boolean b = true;
        float f = 5.5f;
        double d = 10.15d;
        byte by = 20;
        short sh = 30;
        int[] Array1_int = { 1, 2, 3 };
        char[] Array2_char = { 'a', 'b', 'c' };
        String[] Array3_String = { "Navdeep", "Singh", "Rathore" };
        boolean[] Array4_boolean = { true, false };

        System.out.println("int: " + x);
        System.out.println("char: " + ch);
        System.out.println("String: " + s);
        System.out.println("boolean: " + b);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("Array_int: " + Array1_int[0]);
        System.out.println("Array_char: " + Array2_char[2]);
        System.out.println("Array_String: " + Array3_String[1]);
        System.out.println("Array_boolean: " + Array4_boolean[1]);
    }
}