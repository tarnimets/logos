package lesson8;

public enum Month {
  APRIL(Season.WINTER);

  private Season season;

  Month(Season season) {
    this.season = season;
  }

  public Season getSeason() {
    return season;
  }
}

