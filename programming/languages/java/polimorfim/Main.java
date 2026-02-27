public class Main {
  public static void main(String[] args) {
    Employee e = new Manager();

    System.out.println(e.salary); // Correct 
    // System.out.println(e.bonus); // Error
    System.out.println(((Manager)e).bonus); // Cocrrect 
  }
}
