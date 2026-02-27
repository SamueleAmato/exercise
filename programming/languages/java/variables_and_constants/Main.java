public class Main {
  public static final double PI = 3.14; // Costante di classe, questa costante può essere accessata senza dover instanziare la classe.
  public static void main(String[] args) {
    // Declaration
    int x;
    x = 10;

    // Declaration + Init.
    int y = 10;
    
    // Declaration + Init. + compiler deduct.
    var z = 10;

    // CONSTANT
    
    final double PI = 3.14;

    // PI = 2; ERROR
  }
}
