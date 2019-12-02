package iterator;

@FunctionalInterface
public interface Test {

  void test(String a);

  default String defaultMethod() {
    return "";
  }

  static void staticMethod() {
    System.out.println("a");
  }
}
