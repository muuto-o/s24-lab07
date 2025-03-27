package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private boolean[] occupied;

    public Road(int length) {
        this.occupied = new boolean[length];
    }

    public void occupyPosition(int position) {
        if (position >= 0 && position < occupied.length) {
            occupied[position] = true;
        }
    }

    public boolean isOccupied(int position) {
        return position >= 0 && position < occupied.length && occupied[position];
    }
}
