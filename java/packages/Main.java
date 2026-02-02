import com.nota.test.Person;
import com.nota.test.PPerson;

public class Main {
  public static void main(String[] args) {
    Person p = new Person();

    PPerson pp = new PPerson();

    // p.age is package private, so pp.getAge that get a Person and return is age can access it
    System.out.println(pp.getAge(p));
  }
}
