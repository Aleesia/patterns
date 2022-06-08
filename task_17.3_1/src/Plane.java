public class Plane {

  private boolean isInTheAir;
  private int id;


  public Plane(int id) {
    this.id = id;
    isInTheAir = false;
  }

  public void takeOff() {
      System.out.println(this + " is taking off...");
      isInTheAir = true;
    }

  public void land() {
    System.out.println(this + " is landing...");
    isInTheAir = false;
  }

  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  @Override
  public String toString() {
    return "Plane{" +
            "id=" + id +
            "; isInTheAir=" + isInTheAir +
            '}';
  }
}
