package exceptions;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String a;
    String b = "b";

    try {
      a = "asdfsad";
      validate(a,b);
      System.out.println("YESa");
    } catch (IllegalStateException | IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.out.println("YESb");
      e.printStackTrace();
      System.out.println("YESc");
      System.out.println(e.getStackTrace());
      System.out.println("YESd");
      System.out.println(e);
      a = "sdfdsf";
    }
    System.out.println(a);
    System.out.println("");


    try (
        Scanner scanner = new Scanner(System.in);
         Scanner scannser = new Scanner(System.in)
    ) {
      testException();
      scanner.next();
    } catch (MyException e) {
      e.printStackTrace();
    } catch (Exception we) {

    }
  }

  private static void testException() throws MyException {
    throw new MyException("Any", "sdfsdf");
  }

  private static void validate(String a, String b) throws IllegalStateException, IllegalArgumentException {
    if (a.equals(b)){
      System.out.println("Equals");
      Person person = new Person();
      System.out.println(person.phone);
      String phoneModel = person.phone.model;
      System.out.println(phoneModel);
    } else {
      System.out.println("Not equals");
      throw new IllegalStateException("sdfsdf");
    }
  }
}
