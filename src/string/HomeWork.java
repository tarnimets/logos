package string;

public class HomeWork {

  static String test = "I am am am.";

  public static void main(String[] args) {
    String[] split = test.split("[.]");

    for (int i = 0; i < split.length; i++) {
      String s = split[i];
      String[] ams = s.split(" ");
      for (String m : ams) {
        if (m.equals("am")) {
          System.out.println(m);
        }
      }
    }


    int am = test.indexOf("am");
    System.out.println(am);
    if (am < test.length()) {
      int am1 = test.indexOf("am", am + 1);
      System.out.println(am1);
    }
  }
}
