package string;

public class Student {
  String name;
  String sex;
  int age;
  int mark;
  String teacher;

  public Student(String name, String sex, int age, int mark, String teacher) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.mark = mark;
    this.teacher = teacher;
  }

  public String toSting() {
    return "Student{" +
        "name='" + name + '\'' +
        ", sex='" + sex + '\'' +
        ", age=" + age +
        ", mark=" + mark +
        ", teacher='" + teacher + '\'' +
        '}';
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Student{");
    sb.append("name='").append(name).append('\'');
    sb.append(", sex='").append(sex).append('\'');
    sb.append(", age=").append(age);
    sb.append(", mark=").append(mark);
    sb.append(", teacher='").append(teacher).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
