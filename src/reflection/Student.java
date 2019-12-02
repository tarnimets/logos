package reflection;

import java.util.Objects;

public class Student {

  private String name;
  private String sex;
  private int age;

  public String lastName;

  public Student(String name, String sex) {
    this.name = name;
    this.sex = sex;
  }

  public Student(String name) {
    this.name = name;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Student{");
    sb.append("name='").append(name).append('\'');
    sb.append(", sex='").append(sex).append('\'');
    sb.append(", age=").append(age);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o instanceof Student) {
      return false;
    }
    Student student = (Student) o;
    return age == student.age &&
        Objects.equals(name, student.name) &&
        Objects.equals(sex, student.sex) &&
        Objects.equals(lastName, student.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sex, age, lastName);
  }
}
