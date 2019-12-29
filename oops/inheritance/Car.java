/**
 * Single level Inheritance
 */
public class Car {

    void tyres() {
        System.out.println("Number of tyres");
    }
    
}

public class Mercedes extends Car {

    public static void main(String[] args) {
        Mercedes obj = new Mercedes();
        obj.tyres();
    }
    
}