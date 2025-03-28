package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(int length) {
        this.occupied = new boolean[length];
    }

    public boolean isOccupied(int position) {
        return position >= 0 && position < occupied.length && occupied[position];
    }

    public void setOccupied(int position, boolean status) {
        if (position >= 0 && position < occupied.length) {
            occupied[position] = status;
        }
    }
}
