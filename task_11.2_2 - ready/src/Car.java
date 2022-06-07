public class Car {

    public static void main(String[] args) {
        CarFacade carFacade  = new CarFacade();
        System.out.println(carFacade);

        carFacade.start_driving();
        carFacade.stop();
    }

}