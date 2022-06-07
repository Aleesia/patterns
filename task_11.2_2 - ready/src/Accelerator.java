public class Accelerator {
  private boolean isPressed;

  public Accelerator() {
    this.isPressed = false;
  }

  public void press() {
    System.out.println("Pressing accelerator");
    isPressed = true;
  }

  public void lift() {
    System.out.println("Lifting accelerator");
    isPressed = false;
  }

}
