package org.campusdual.racecontrol;

public class Main {
    public static void main (String [] args) {
        //Control control = new Control();
        //control.testRace();

        InputReader inputReader = new InputReader();
        int opcion = 0;
        while (opcion == 0) {
            System.out.println("escoja una opcion");
            opcion = inputReader.getMenuOption(4);
        }
    }
}
