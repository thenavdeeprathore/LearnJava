/**
 * @author : Navdeep
 * Variable Program 01: Types of Variables
 * 
 * There are 3 types of variables
 * 1) Instance Variable
 * 2) Static Variable
 * 3) Local Variable
 * Today we will discuss first type which is INSTANCE Variables in Java.
 */

class Var_01 {

    /*
     * IMPORTANT POINTS:
     * 
     * Instance variables are non-static variables and are declared in a class outside any method, constructor or block
     * a) As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
     * b) Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
     * c) Initialization of Instance Variable is not Mandatory. Its default value is 0
     * d) Instance Variable can be accessed only by creating objects.
     */
    
    int x = 10;
    int y;

    void display(){
        y = 20;
        System.out.println(x);  //10
        System.out.println(y);  //20
    }
    public static void main(String[] args) {
        // System.out.println(x);   //Invalid, can't use instance variable directly in static method
        // System.out.println(Var_01.x); //Invalid, can't use class name either
        
        Var_01 obj = new Var_01();
        System.out.println(obj.x);  //10
        obj.display();
        System.out.println(obj.y);  //20
        obj.y = 30;
        System.out.println(obj.y);  //30
    }
}