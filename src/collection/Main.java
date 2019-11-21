package collection;

import java.util.Arrays;
import java.util.Collection;

public class Main {

  static Person[] persons = new Person[10];
  static Collection<Person> peoples;

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      persons[i] = new Person("" + (int) (Math.random() * i * 100));
    }
    persons[0] = null;
    System.out.println(Arrays.toString(persons));
//    Arrays.sort(persons, Person::compareTo);
    System.out.println(Arrays.toString(persons));

    Person[] people = Arrays.copyOfRange(persons, 0, 1);
    System.out.println(Arrays.toString(people));

    System.out.println(Arrays.deepToString(persons));

//    for (int i = 0; i < persons.length; i++) {
//      System.out.println(persons[i]);
//    }

    System.out.println(new Person("test").toString());
  }
}
