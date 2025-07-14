package org.soipan;

import org.soipan.interfaces.Sorter;

public class SortedByName implements Sorter {
    @Override
    public void sortDetails() {
        System.out.println("sorted by name");
    }
}
