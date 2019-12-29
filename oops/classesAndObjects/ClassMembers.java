/**
 * @author : Navdeep 
 * Class and it's members
 * 1) Variables
 * 2) Constructor
 * 3) Blocks
 * 4) Methods
 * 5) Inner classes
 */

public class ClassMembers {

    
    int a = 10;                     // 1) Instance Variable
    
    static int b = 20;              // 2) Static Variable

    {                               // 3) default block
        int c = 30;                 // 4) Local Variable
        System.out.println(c);
    }

    static {                        // 5) static block

    }

    ClassMembers(){                 // 6) default constructor or no-arg constructor

    }

    void nonStaticMethod(){         // 7) method -> non-static

    }

    static void staticMethod(){     // 8) method -> static

    }

    public static void main(String[] args) {    // 9) main method
        
    }

    static class innerClass {                   // 10) inner class

        public static void main(String[] args) {
            
        }
    }
}