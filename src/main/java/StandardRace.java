import java.util.List;

public class StandardRace extends Race {

    private int length;
    private int lapsAmount;

    public StandardRace (String raceName, int length, List<Car> cars, int lapsAmount) {
        super(raceName, length, cars);
        this.length = length;
        this.lapsAmount = lapsAmount;
    }

    protected List<Car> lap() {
        cars.remove(cars.size()-1);
        return this.cars;
    }

    public Podium runRace() {
        while (currentLap <= lapsAmount) {
            currentLap++;
        }
    }
}
