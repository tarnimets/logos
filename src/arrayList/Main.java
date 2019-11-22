package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    test(list);
    LinkedList newList = new LinkedList();
    test(newList);
    List list2 = new ArrayList();

    for(Object s :list2) {

    }

    //linkedList


    for (int i = 0; i < 100; i++) {
      list.add(i);
    }
    Integer remove = list.remove(3);
    System.out.println("remove " + remove);
    Integer integer = list.get(3);
    System.out.println("integet " + integer);
  }


  public static void test(List list) {
    System.out.println(list);
  }
}
