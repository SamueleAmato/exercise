public class Main {
  public static void main(String[] args) {
    byte k;
    short x;
    int y; 
    long z;
    float j;
    double t;

    // Cast syntax: (new_type)variable.
    
    short new_k = (short)(k); // More precise type can inglobe less precise type varible without loss of data. The same thing dont happen in a reversed situation.
    
    int new_t = (int)t; // new_t will lose some data contained t in order to convert it to a less precise data type (int).
  
    // NOTE: All conversione like this one: `type to less_precise type` will probably cause lose of information.

  }
}
