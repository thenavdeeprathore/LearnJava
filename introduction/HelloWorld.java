/**
 * @author: Navdeep
 * Welcome to the first Java Program
 */

 /*
 NOTE:
 The process of Java programming can be simplified in three steps:
 STEP 1: Create the program by typing it into a text editor and saving it to a file – HelloWorld.java
 STEP 2: Compile it by typing “javac HelloWorld.java” in the terminal window.
 STEP 3: Execute (or run) it by typing “java HelloWorld” in the terminal window.
 */

class HelloWorld {

    // Your program begins with a call to main()
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * IMPORTANT POINTS:
     * 
     * Q1) Can we run or print message without main method?
     * Answer: NO, from JDK7 onwards main method is mandatory.
     * 
     * Q2) Does JVM create object of Hello class (the class with main())?
     * Answer: N0, the reason for main() static in Java is to make sure that the main() can be called without any instance
     * 
     * 1) The name of the class defined by the program is HelloWorld, which is same as name of file(HelloWorld.java). 
     * This is not a coincidence. In Java, all codes must reside inside a class and there is at most one public class which contain main() method.
     */
}