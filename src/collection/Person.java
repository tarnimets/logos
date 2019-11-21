package collection;

public class Person implements Comparable<Person> {

  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Person{");
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }

  @Override
  public int compareTo(Person o) {
    return this.name.compareTo(o.name);
  }
}
