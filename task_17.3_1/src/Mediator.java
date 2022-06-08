import java.util.ArrayList;

public class Mediator {

    private ArrayList<Plane> planesInFlight;
    private ArrayList<Plane> planesOnGround;
    private ArrayList<Runway> runways;

    public Mediator() {
        this.planesInFlight = new ArrayList<>();
        this.planesOnGround = new ArrayList<>();
        this.runways = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
        if (plane.getIsInTheAir()){
            planesInFlight.add(plane);
        }
        else {
            planesOnGround.add(plane);
        }
    }

    public void addRunway(Runway runway) {
        runways.add(runway);
    }

    public void takeOff(Plane plane, Runway runway) {
        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            plane.takeOff();
            planesOnGround.remove(plane);
            planesInFlight.add(plane);
            runway.setIsAvailable(false);
        }
        else {
            System.out.println("Plane " + plane + " failed to take off");
        }
    }

    public void land(Plane plane, Runway runway) {
        if (plane.getIsInTheAir() && runway.getIsAvailable()) {
            plane.land();
            planesOnGround.add(plane);
            planesInFlight.remove(plane);
            runway.setIsAvailable(false);
        }
        else {
            System.out.println("Plane "+plane+" failed to land");
        }
    }

    public void takeOff(Plane plane) {
        if (!plane.getIsInTheAir()) {
            for (Runway way: runways) {
                if (way.getIsAvailable()) {
                    plane.takeOff();
                    planesOnGround.remove(plane);
                    planesInFlight.add(plane);
                    way.setIsAvailable(false);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Plane " + plane + " failed to take off");
        }
    }

    public void land(Plane plane) {
        if (plane.getIsInTheAir()) {
            for (Runway way: runways) {
                if (way.getIsAvailable()) {
                    plane.land();
                    planesOnGround.add(plane);
                    planesInFlight.remove(plane);
                    way.setIsAvailable(false);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Plane " + plane + " failed to land");
        }
    }
}
