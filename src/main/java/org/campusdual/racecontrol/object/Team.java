package org.campusdual.racecontrol.object;

import org.campusdual.racecontrol.object.Car;

import java.util.List;

public class Team {
    private String name;
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        for (Car car : cars) {
            car.setTeam(this);
        }
        this.cars = cars;
    }

    public String toString() {
        return "Team name: " + name + "\n" +
                cars.toString() + "\n";
    }
}
