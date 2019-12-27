/**
 * @author : Navdeep
 * DataTypes Program 01:
 * Declare and initialize Primitive Data Types
 */

class DataTypes_01 {

    public static void main(String[] args) {
        dataType();
    }

    public static void dataType() {
        // Numeric
        int x = 10;
        byte by = 20;
        short sh = 30;
        float f = 5.5f;
        double d = 10.15d;
        // Non-numeric
        char ch = 'x';
        boolean b = true;
        
        

        System.out.println("int: " + x);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + b);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
    }
}