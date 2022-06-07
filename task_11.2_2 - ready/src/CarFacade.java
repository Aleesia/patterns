public class CarFacade {

  public void start_driving() {
    System.out.println("--------------- STARTING ---------------");
    Ignition ignition = new Ignition();
    Clutch clutch = new Clutch();
    Accelerator accelerator = new Accelerator();
    GearStick gearStick = new GearStick();
    HandBrake handBrake = new HandBrake();

    clutch.press();
    ignition.turnOn();
    gearStick.changeGear(1);
    clutch.lift();
    accelerator.press();

    clutch.press();
    gearStick.changeGear(2);
    clutch.lift();
  }

  public void stop() {
    System.out.println("--------------- STOP ---------------");
    Ignition ignition = new Ignition();
    Clutch clutch = new Clutch();
    Accelerator accelerator = new Accelerator();
    GearStick gearStick = new GearStick();
    HandBrake handBrake = new HandBrake();

    accelerator.lift();
    clutch.press();
    handBrake.pushDown();
    gearStick.changeGear(1);
    ignition.turnOff();
    clutch.lift();
    handBrake.liftUp();
  }
}