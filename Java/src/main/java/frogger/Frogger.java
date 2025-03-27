package frogger;

import frogger.FroggerID;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    private FroggerID froggerID;
    private int position;

    public Frogger(String firstName, String lastName) {
        // this.records = new Records();
        this.froggerID = new FroggerID(firstName, lastName);
        this.position = 0;
    }

    public void move(int steps) {
        this.position += steps;
    }

    public boolean isOnRoad(Road road) {
        return road.isOccupied(position);
    }

}
