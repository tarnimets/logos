import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.name = "T";

    Person person2 = new Person();
    person.name = "C";
    List<Person> personList = new ArrayList<>();
    personList.add(person);
    personList.add(person2);
    personList.sort(new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
      }
    });
  }
}
