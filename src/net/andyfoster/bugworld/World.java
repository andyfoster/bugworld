package net.andyfoster.bugworld;

import java.util.ArrayList;

public class World {

    private final ArrayList<Bug> bugs;
    private final int height = 10;
    private final int width = 10;

    public World() {
        bugs = new ArrayList<>();

        bugs.add(new Bug("Steve", "Spider", 'S', 5, 4, 30, 1));
        bugs.add(new Bug("Charles", "Cockroach", 'C', 3, 9, 30, 2));
    }

    public void drawWorld() {
        StringBuilder sb = new StringBuilder();
        sb.append("|--------------------|\n");

        for (int y = 0; y < height; y++) {

            sb.append("|");
            for (int x = 0; x < width; x++) {
                for (Bug b : bugs) {
                    if (b.getX() == x && b.getY() == y) {
                        sb.append(b.getSymbol());
                    } else {
                        sb.append(" ");
                    }
                }
            }
            sb.append("|\n");
        }
        sb.append("|--------------------|");
        System.out.println(sb);

    }

}
