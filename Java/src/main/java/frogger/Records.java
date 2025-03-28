package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */

public class Records {
    private final List<FroggerID> records = new ArrayList<>();

    public void addRecord(FroggerID froggerID) {
        if (!records.contains(froggerID)) {
            records.add(froggerID);
        } else {
            System.out.println("Duplicate record!");
        }
    }

    public boolean isRegistered(FroggerID froggerID) {
        return records.contains(froggerID);
    }
}
