package net.andyfoster.bugworld;

import java.util.Comparator;

public class BugComparator implements Comparator<Bug> {

    @Override
    public int compare(Bug b1, Bug b2) {
        return b1.compareTo(b2);
    }
}
