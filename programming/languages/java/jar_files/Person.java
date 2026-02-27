public class Person {
  private int age;
  private String name;

  static {
    System.out.println("Oggetto creato");
  }

  public Person(){
    this(0, "empty");
  }

  public Person(int age, String name) {
    setAge(age);
    this.name = name;
  }

  // a static function can be called without the need of a class instance
  static public boolean validName(String name) {
    if (name.length()>= 3 && name.length()<= 10) {
      return true;
    }
    return false;
  }
    
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    // Not only incapsulation provide security regarding access of the data but also safe in the term of how they can be accessed
    if (age < 0) {
      this.age = 0;
      return; 
    }
    this.age = age;
  }
}
