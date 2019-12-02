package iterator;

import java.util.ListIterator;

public class MyArrayList<T> extends Abs implements Test, ListIterator {

  @Override
  public void test(String a) {
    System.out.println(a);
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object next() {
    return null;
  }

  @Override
  public boolean hasPrevious() {
    return false;
  }

  @Override
  public Object previous() {
    return null;
  }

  @Override
  public int nextIndex() {
    return 0;
  }

  @Override
  public int previousIndex() {
    return 0;
  }

  @Override
  public void remove() {

  }

  @Override
  public void set(Object o) {

  }

  @Override
  public void add(Object o) {

  }
}
