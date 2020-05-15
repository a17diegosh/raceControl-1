package org.campusdual.racecontrol.race;

import org.campusdual.racecontrol.object.Car;
import org.campusdual.racecontrol.object.Podium;

import java.util.List;

public class StandardRace extends Race {

    private int lapsAmount;

    public StandardRace (String raceName, int length, int lapsAmount) {
        super(raceName, length);
        this.length = length;
        this.lapsAmount = lapsAmount;
    }

    public StandardRace (String raceName, int length, List<Car> cars, int lapsAmount) {
        this(raceName, length, lapsAmount);
        this.cars.addAll(cars);
    }

    protected List<Car> lap() {
        setCarsDistance();
        sortCars();
        System.out.println(cars.toString());
        return this.cars;
    }

    private int getFirstCarLap() {
        Car firstCar = cars.get(0);
        return firstCar.getOdometer() / this.length;
    }

    public Podium runRace() {
        while (currentLap < lapsAmount) {
            lap();
            if (currentLap == getFirstCarLap()) {
                currentLap++;
            }
        }
        podium = new Podium(cars.get(FIRST_POSITION), cars.get(SECOND_POSITION), cars.get(THIRD_POSITION));
        return podium;
    }
}
