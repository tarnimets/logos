public class Person {

  String name;
  int a;


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Person{");
    sb.append("name='").append(name).append('\'');
    sb.append(", a=").append(a);
    sb.append('}');
    return sb.toString();
  }
}
