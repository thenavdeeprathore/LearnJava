/**
 * @author : Navdeep
 * Variable Program 03: Types of Variables
 * 
 * There are 3 types of variables
 * 1) Instance Variable
 * 2) Static Variable
 * 3) Local Variable
 * Today we will discuss third type which is LOCAL Variables in Java.
 */

class Var_03 {

        /*
     * IMPORTANT POINTS:
     * 
     * A variable defined within a block or method or constructor is called local variable
     * 
     * a) These variable are created when the block in entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
     * b) The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.
     * c) Initialization of Local Variable is Mandatory.
     */

     void display() {
        //  int x;  //Initialization is Mandatory
         int a = 10;
         System.out.println(a);
     }

    public static void main(String[] args) {
        Var_03 obj = new Var_03();
        obj.display();
        // System.out.println(a);   //Invalid
        // System.out.println(obj.a);   //Invalid
    }
}