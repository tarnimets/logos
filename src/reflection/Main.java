package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException, InstantiationException {
    Student student = new Student();
    student.setAge(15);
    student.setSex("M");
    student.setName("Roman");

    System.out.println(student);
    System.out.println("Name " + student.getName());
    System.out.println("Sex " + student.getSex());

    Class<? extends Student> studentClazz = student.getClass();

    Class<?> clazz = Class.forName(Student.class.getName());

    Constructor<?>[] constructors = studentClazz.getConstructors();
    System.out.println(Arrays.toString(constructors));
    System.out.println(    studentClazz.getName());
    System.out.println("Methods " + Arrays.toString(studentClazz.getDeclaredMethods()));

    Method getName = studentClazz.getDeclaredMethod("getName");
    String studentName = (String) getName.invoke(student);
    System.out.println(studentName);

    Field age = studentClazz.getDeclaredField("age");
    age.setAccessible(true);
    System.out.println(Arrays.toString(studentClazz.getDeclaredFields()));
    int o = (int) age.get(student);
    System.out.println(o);
    age.set(student, 25);
    System.out.println(student);

    System.out.println(Arrays.toString(studentClazz.getFields()));

    Constructor<? extends Student> constructor = studentClazz.getConstructor();
    Student studentReflect = constructor.newInstance();
    studentReflect.setAge(18);
    System.out.println(studentReflect);

    for (Constructor<?> constr : studentClazz.getConstructors()) {
      Class<?>[] parameterTypes = constr.getParameterTypes();
      System.out.println(constr + Arrays.toString(parameterTypes));
    }
    Constructor<? extends Student> newConstr = studentClazz.getConstructor(String.class);
    Student student1 = newConstr.newInstance("Taras");
    System.out.println(student1);

    studentClazz.getInterfaces();
  }
}
