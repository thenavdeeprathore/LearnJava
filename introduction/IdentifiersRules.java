/**
 * @author: Navdeep
 * Rules for Java Identifiers NOTES:
 * 
 * Rule 1: Only allowed characters for identifiers are all alphanumeric ([a to z],[A to Z],[0 to 9]) and '$' dollar sign and '_' underscore sign.
 * Rule 2: Identifiers should not start with digits([0-9]). For example “123geeks” is a not a valid java identifier.
 * Rule 3: Java identifiers are case-sensitive. (Example - number, Number, NUMBER)
 * Rule 4: There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only
 * Rule 5: Reserved Words can’t be used as an identifier. For example “int while = 20;” is an invalid statement as while is a reserved word. There are 53 reserved words in Java
 */

class IdentifiersRules {

// Valid Java Identifiers
    int MyVariable;
    int MYVARIABLE;
    int myvariable;
    int _myvariable;
    int $myvariable;
    int sum_of_array;
    int abc123;
    int Int;

// Invalid Java Identifiers:
    // int My Variable  // contains a space
    // int 123geeks   // Begins with a digit
    // int a+c // plus sign is not an alphanumeric character
    // int variable-2 // hyphen is not an alphanumeric character
    // int sum_&_difference // ampersand is not an alphanumeric character
    // int int; // reserve words
    // int if; // reserve words
    
}