package com.customs;

import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.TruckCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class UkrainianCosts implements Customs {

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle american;
        VehicleCalculator calculator;
        float dollar_to_hrn = 29.8f; // рандомний курс долара
        if (auto.model.equals("truck")) {
            american = new com.vehiclecalculator.Truck(auto.age, auto.mileage);
            calculator = new TruckCalculator();
        }
        else {
            american = new com.vehiclecalculator.Car(auto.age, auto.model, auto.damaged ? 1 : 0);
            calculator = new CarCalculator();
        }
        calculator.setVehicle(american);
        String result = calculator.calculatePrice();
        return dollar_to_hrn * Float.parseFloat(result.substring(0,result.length()-3));
    }

    @Override
    public float tax(Auto auto) {
        return 0.2f * vehiclePrice(auto);
    }
}
