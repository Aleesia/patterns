import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        Command commandOnKitchen = new Command() {
            @Override
            public void execute() {
                kitchenLamp.lightOn();
            }
        };

        Command commandOffKitchen = new Command() {
            @Override
            public void execute() {
                kitchenLamp.lightOff();
            }
        };
        controllerKitchenLamp.setCommandOn(commandOnKitchen);
        controllerKitchenLamp.setCommandOff(commandOffKitchen);



        Command commandOnHall = new Command() {
            @Override
            public void execute() {
                hallLamp.lightOn();
            }
        };

        Command commandOffHall = new Command() {
            @Override
            public void execute() {
                hallLamp.lightOff();
            }
        };
        controllerHallLamp.setCommandOn(commandOnHall);
        controllerHallLamp.setCommandOff(commandOffHall);



        Command commandOnBedroom = new Command() {
            @Override
            public void execute() {
                bedroomLamp.lightOn();
            }
        };

        Command commandOffBedroom = new Command() {
            @Override
            public void execute() {
                bedroomLamp.lightOff();
            }
        };
        controllerBedroomLamp.setCommandOn(commandOnBedroom);
        controllerBedroomLamp.setCommandOff(commandOffBedroom);



        Command commandOnBathroom = new Command() {
            @Override
            public void execute() {
                bathroomLamp.lightOn();
            }
        };

        Command commandOffBathroom = new Command() {
            @Override
            public void execute() {
                bathroomLamp.lightOff();
            }
        };
        controllerBathroomLamp.setCommandOn(commandOnBathroom);
        controllerBathroomLamp.setCommandOff(commandOffBathroom);


        Command commandOnUniversal = new Command() {
            @Override
            public void execute() {
                kitchenLamp.lightOn();
                hallLamp.lightOn();
                bedroomLamp.lightOn();
                bathroomLamp.lightOn();
            }
        };

        Command commandOffUniversal = new Command() {
            @Override
            public void execute() {
                kitchenLamp.lightOff();
                hallLamp.lightOff();
                bedroomLamp.lightOff();
                bathroomLamp.lightOff();
            }
        };
        controllerUniversal.setCommandOn(commandOnUniversal);
        controllerUniversal.setCommandOff(commandOffUniversal);

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.off();

    }
}
