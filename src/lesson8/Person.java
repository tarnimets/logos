package lesson8;

public class Person {

  public String name;
  public Sex sex;

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", sex='" + sex + '\'' +
        '}';
  }
}
