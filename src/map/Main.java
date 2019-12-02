package map;

import collection.Person;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Map<String, String> maps = new HashMap<>();

    maps.put("Cat", "Myr");
    maps.put("taC", "hav");
    maps.put("Dog", "rfv");
    maps.put("DOG", "wsx");
    maps.put("Dog", "qaz");

    System.out.println(maps.get("Cat"));

    System.out.println(maps);
    System.out.println("Cat".hashCode());
    System.out.println("taC".hashCode());

    Map.Entry<String, String> next = maps.entrySet().iterator().next();
    maps.put("Cat", "newMyr");
    System.out.println(maps);
    next.setValue("entry");
    System.out.println(maps);
    Set<String> strings = maps.keySet();
    System.out.println(strings);

    Collection<String> values = maps.values();
    System.out.println(values);

    System.out.println(maps.containsKey("Cata"));
    maps.forEach((key, value) -> {
      System.out.println(value);
      value = "Q";
    });

    System.out.println(maps);

    Map<String, Person> personMap = new HashMap<>();
    personMap.put("1", new Person("Taras"));
    personMap.put("2", new Person("Roman"));

    System.out.println(personMap);

    personMap.forEach((s, person) -> {
      System.out.println(s);
      System.out.println(person);
      person.name = "Andriy";
      System.out.println(person);
    });
    Map<String, Integer> intMap = new HashMap<>();
    intMap.put("1", 1);
    intMap.put("2", 2);

    System.out.println(personMap);

    intMap.forEach((s, person) -> {
      System.out.println(s);
      System.out.println(person);
      person = 5;
    });

    intMap.forEach((s, person) -> {
      System.out.println(s);
      System.out.println(person);
    });



    Map<Person, Integer> personIntegerMap = new HashMap<>();

    Person taras = new Person("Taras");
    Person taras2 = new Person("Taras");
    System.out.println(taras.hashCode());
    System.out.println(taras2.hashCode());
    personIntegerMap.put(taras, 1);
    Person roman = new Person("Roman");
    System.out.println(roman.hashCode());
    personIntegerMap.put(roman, 2);
    System.out.println(personIntegerMap);

    System.out.println(personIntegerMap.get(taras2));
  }

}
