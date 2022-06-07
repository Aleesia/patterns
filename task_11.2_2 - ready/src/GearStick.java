public class GearStick {

  private int gear = 0;

  public void changeGear(int gear) {
    if ((0 <= gear) && (gear <= 5)) {
      System.out.println("Changing gear to " + gear);
      this.gear = gear;
    }
    else {
      System.out.println("Cannot change gear to " + gear + ": this gear doesn't exist");
    }
  }

}
