import java.io.Console;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
  
    System.out.println("Input: "+ input + "\n");

    int second_input = s.nextInt();
    s.nextLine(); // s.nextInt doesnt read the \n (enter) so wee need to call it or the next call will return just "\n";
  
    System.out.println("Input: "+ second_input + "\n");

    // Read password
    
    Console c = System.console(); 

    String pass = c.readPassword().toString();

    System.out.println("Input: "+ pass + "\n");

  }
}
