/**
 * @author : Navdeep
 * DataTypes Program 02:
 * Print Default values of both Primitive and Non-primitive data types
 */
public class DataTypes_02 {

    int x;
    char ch;
    byte by;
    short sh;
    long l;
    float f;
    double d;
    boolean b;
    String s;

    public static void main(String[] args) {
        DataTypes_02 T = new DataTypes_02();

        System.out.println("int: " + T.x);
        System.out.println("char: " + T.ch);
        System.out.println("byte: " + T.by);
        System.out.println("short: " + T.sh);
        System.out.println("long: " + T.l);
        System.out.println("float: " + T.f);
        System.out.println("double: " + T.d);
        System.out.println("boolean: " + T.b);
        System.out.println("String: " + T.s);
    }
}