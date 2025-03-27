package frogger;

import java.util.ArrayList;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */

public class Records {
    private ArrayList<FroggerID> recordList;

    public Records() {
        this.recordList = new ArrayList<>();
    }

    public void addRecord(FroggerID froggerID) {
        if (!recordList.contains(froggerID)) {
            recordList.add(froggerID);
        }
    }

    public boolean hasRecord(FroggerID froggerID) {
        return recordList.contains(froggerID);
    }
}
