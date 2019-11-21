package lesson8;

import static lesson8.Sex.FEMALE;
import static lesson8.Sex.MALE;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "taras";
    person.sex = Sex.FEMALE;

    System.out.println(person);

    //
    Sex female = Sex.valueOf("FEMALE");
    System.out.println(female);
    Sex[] values = Sex.values();
    System.out.println(Arrays.toString(values));
    String name = Sex.MALE.name();
    System.out.println(name);
    int x = Sex.MALE.compareTo(FEMALE);
    System.out.println(x);
    int y = Sex.MALE.compareTo(MALE);
    System.out.println(y);
    int z = FEMALE.compareTo(MALE);
    System.out.println(z);
    int ordinal = FEMALE.ordinal();
    System.out.println(ordinal);
    String name1 = FEMALE.getName();
    System.out.println(name1);


    Scanner scanner = new Scanner(System.in);
    System.err.print(" Enter number ");

    String next = scanner.next();
    int i = Integer.parseInt(next);
    System.out.println(i);
  }

}
