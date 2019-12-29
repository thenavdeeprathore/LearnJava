/**
 * @author : Navdeep 
 * Access Modifiers for Constructors
 */

public class Modifier_Constructors {

    /*
     * 1. default 
     * 2. public 
     * 3. private 
     * 4. protected
     */

    Modifier_Constructors(){
        System.out.println("default constructor");
    }

    public Modifier_Constructors(int a){
        System.out.println("public constructor");
    }

    private Modifier_Constructors(String s){
        System.out.println("private constructor");
    }

    protected Modifier_Constructors(char c){
        System.out.println("protected constructor");
    }

    public static void main(String[] args) {
        new Modifier_Constructors();
        new Modifier_Constructors(10);
        new Modifier_Constructors("Java");
        new Modifier_Constructors('N');
    }
}