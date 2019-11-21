package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    String name = "Taras";

    String nameNew = "Taras" + name;

    String cat1 = "Cat";
    String cat2 = "Cat";
    String cat3 = new String("Cat");

    System.out.println(cat1 == cat2);
    System.out.println(cat1 == cat3);

    System.out.println(cat1.equals(cat3));

    char[] chars = name.toCharArray();
    System.out.println(Arrays.toString(chars));
    System.out.println(chars.length);
    System.out.println(chars[0]);


    //Methods
    String testString = "I like java";
    boolean l = testString.startsWith("l");
    System.out.println(l);
    boolean a = testString.endsWith("a");
    System.out.println(a);
    String substring = testString.substring(2, 6);
    System.out.println(substring);
    boolean j = testString.contains("j");
    System.out.println(j);
    int like = testString.indexOf("like");
    System.out.println(like);

    String substring1 = testString.substring(testString.indexOf("l"), testString.length());
    System.out.println(substring1);
    String nameString = "   test   ";
    System.out.println(nameString);
    String trim = nameString.trim();
    System.out.println(trim);
    String[] s = testString.split(" ");
    System.out.println(Arrays.toString(s));
    String replace = testString.replace("like", "M");
    System.out.println(replace);
    System.out.println(testString);

    String s1 = testString.toUpperCase();
    System.out.println(s1);
    String s2 = s1.toLowerCase();
    System.out.println(s2);
    boolean java = testString.matches("I like java");
    System.out.println(java);

    Student student = new Student("Ivan", "male", 28,5, "XIO");
    System.out.println(student);


    List strings = new LinkedList();

    strings.add(student);

    strings.add(1);

    strings.add("Taras");

  }
}
