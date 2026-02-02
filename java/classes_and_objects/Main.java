public class Main {
  public static void main(String[] args) {
    Person p = new Person();

    // "Object created" will be printed only the first time because the init. block is static.
    Person p2 = new Person();

    System.out.println(p.getAge());
  }
}
