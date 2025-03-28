package frogger;

import frogger.FroggerID;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {
    private final FroggerID froggerID;
    private int position;

    public Frogger(String firstName, String lastName) {
        this.froggerID = new FroggerID(firstName, lastName);
        this.position = 0;
    }

    public void move(int steps, Road road) {
        int newPosition = this.position + steps;
        if (!road.isOccupied(newPosition)) {
            this.position = newPosition;
        } else {
            System.out.println("Cannot move, road is occupied!");
        }
    }

    public FroggerID getFroggerID() {
        return froggerID;
    }
}
