package Tasks4;

import java.util.Random;

/**
 * Created by pavlo.balyuk on 9/5/2017.
 */
class Car {
    double gas;
    int wheels;
    boolean motor;

    Car () {
        gas = setGas();
        if ( (0.2 < gas) || (gas > 2.0) ) {
            System.out.print("Need to Gas Station! ");
        }
    }

    Car (int wheelsInput) {
        wheels = wheelsInput;
        if ( (wheels != 4) && ((0.2 < gas) || (gas > 2.0)) ) {
            System.out.print("Someone steal wheels from your car and your Gas too");
        }
    }

    Car (int wheelsInput, boolean motorInput) {
        wheels = wheelsInput;
        gas = setGas();
        motor = motorInput;
        if ( (wheels != 4) && ((0.2 < gas) || (gas > 2.0)) && (motor != true) ) {
            System.out.print("Your's worst day ever! No Gas! No Wheels! No Motor!");
        }
    }

    public double setGas () {
        return gas = new Random().nextDouble();
    }

    public int setWheels (int wheelsInput) {
        return wheels = wheelsInput;
    }

    public boolean setMotor (boolean motorInput) {
        motor = motorInput;
        return motor;
    }

    public double getGas () {
        return gas;
    }

    public int getWheels () {
        return wheels;
    }

    public boolean getMotor () {
        return motor;
    }
}
