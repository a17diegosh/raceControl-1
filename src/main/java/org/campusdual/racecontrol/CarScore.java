package org.campusdual.racecontrol;

import org.campusdual.racecontrol.object.Car;

public class CarScore {
    private Car car;
    private int score;

    public Car getCar() {
        return car;
    }

    public String toString() {
        return "Car: " + car.toString() + "->" + score;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
