public class Podium {
    private Car firstPlace;
    private Car secondPlace;
    private Car thirdPlace;

    public Podium(Car firstPlace, Car secondPlace, Car thirdPlace) {
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
    }

    public String toString() {
        return "1:- " + this.firstPlace.toString() + "\n"
                + "2.- " + this.secondPlace.toString() + "\n"
                + "3.- " + this.thirdPlace.toString();
    }
}
