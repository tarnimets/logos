package exceptions;

public class MyException extends Exception {

  public MyException(String message, String as) {
    super(message);
    System.out.println(as);
  }
}
