import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    var x = 10;

    // Arithmetic operator
    
    x = x / 10; // Division
    x = x - 2;  // Substraction
    x = x + 2;  // Addition
    x = x * 2;  // Multiplication
    x = x % 2;  // Module
    
    // Math function
    
    // NOTE: Math is statically imported, so there is no need to put the Math prefix before calling sqrt. Static import only import static members of a class.

    x = (int)sqrt(x); // Square root
  }
}
