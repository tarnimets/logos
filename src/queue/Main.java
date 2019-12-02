package queue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {


  public static void main(String[] args) {
     Set set = new HashSet();

    Object e = new Object();
    set.add(e);

    LinkedHashSet linkedHashSet = new LinkedHashSet();
    Object next = new Object();


//    TreeSet treeSet = new TreeSet();
//    treeSet
//    next = set.iterator().next();
//
//    System.out.println(e == next);
//
//    test(set);
  }


  public static Set test(Set e) {
    e.remove(null);
    return e;
  }
}
