public class Main {

  public static void main(String[] args) {
    Plane plane1 = new Plane(123);
    Plane plane2 = new Plane(176);
    Plane plane3 = new Plane(31);
    Runway runway1 = new Runway();
    Runway runway2 = new Runway();
    Runway runway3 = new Runway();

    Mediator mediator = new Mediator();

    mediator.addPlane(plane1);
    mediator.addPlane(plane2);
    mediator.addPlane(plane3);
    mediator.addRunway(runway1);
    mediator.addRunway(runway2);
    mediator.addRunway(runway3);

    mediator.takeOff(plane1, runway1);
    mediator.takeOff(plane1);
    mediator.land(plane1, runway1);
    mediator.land(plane1);
    mediator.takeOff(plane3);

  }

}
