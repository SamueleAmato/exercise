public class Main {
  public static void main(String[] args) {
    String str = "Hello";

    String second_str = "Hello";

    second_str += "";

    // Fails: second_str is in a different pool of string compared to str, str is in the pool of "Hello" strings, second str is in the pool of "Hello" + "" strings.
    if (str == second_str) {
      System.out.println("str and second_str point to the same memory pool");
    }
    // Success: second_str chars match perfectly the chars of str
    if (str.equals(second_str)) {
      System.out.println("str and second_str contain the same string");
    }
  }
}
