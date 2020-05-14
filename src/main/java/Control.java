import java.util.ArrayList;
import java.util.List;

public class Control {
    public Race createRace() {
        List<Car> carsList1 = new ArrayList<Car>();
        carsList1.add(new Car("Peugeot", "205"));
        carsList1.add(new Car("Mercedes", "SLK"));
        carsList1.add(new Car("Renault", "Megane"));
        carsList1.add(new Car( "VW", "Polo"));
        carsList1.add(new Car("VW", "passat"));
        Race standarRace = new LapKnockOutRace("Race1",20, carsList1);
        return standarRace;
    }

    public void testRace() {
        Race race = createRace();
        System.out.println("podium: " + race.runRace());
        System.out.println("laps: " + race.getTotalLaps());
    }
}
