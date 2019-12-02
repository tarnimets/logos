package iterator;

import java.util.Comparator;

public class Dog implements Comparator, Comparable{

  String name;
  int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Dog{");
    sb.append("name='").append(name).append('\'');
    sb.append(", age=").append(age);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public int compare(Object o1, Object o2) {
    return ((Dog) o1).name.compareTo(((Dog) o2).name);
  }

  @Override
  public int compareTo(Object o) {
    return Integer.compare(this.age,(((Dog) o).age));
  }
}
