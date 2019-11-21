package lesson8;

public enum Sex {

  MALE("male"),
  FEMALE("female");

  private String name;

  Sex(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
