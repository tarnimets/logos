package iterator;


import collection.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

//
//    Collection<String> strings;
//
////    strings.forEach(asd -> {
////      asd.isEmpty();
////    });
//
////    for (String as : strings) {
////      as.isEmpty();
////    }
//
////    for (int i = 0; i < strings.size(); i++) {
////
////    }
//
//    List list = new ArrayList();
//    for (int i = 0; i < 5; i++) {
//      list.add(i);
//    }
//    System.out.println(list);
//
//    list.get(0);
//    list.iterator().next();
//    Iterator iterator = list.iterator();
//
//    while (true) {
//          if(iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//          } else {
//            break;
//          }
//        }
//
//    MyArrayList<String> myArrayList = new MyArrayList<>();
//
//
//    Person[] people = new Person[10];
//    for (int i = 0; i < 10; i++) {
//      people[i] = new Person(Math.random() * 152 + "");
//    }
//    System.out.println(Arrays.toString(people));
//    Arrays.sort(people);
//    System.out.println(Arrays.toString(people));
//
//    myArrayList.defaultMethod();
//    myArrayList.test("asdsa");
//    Test.staticMethod();
//    Abs.testAbs();
//



    //Comparator

    List<Dog> dogs = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      dogs.add(new Dog("" + i, (int) new Random().nextInt(100)));
    }

    System.out.println(dogs);
    dogs.sort(Dog::compareTo);
    System.out.println(dogs);
  }

}
