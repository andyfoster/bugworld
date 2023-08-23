package net.andyfoster.bugworld;

import java.util.ArrayList;

public class World {

    private final ArrayList<Bug> bugs;
    private final ArrayList<Obstacle> obstacles;
    private final ArrayList<Plant> plants;
    private final int height = 10;
    private final int width = 10;

    public World() {
        bugs = new ArrayList<>();

        bugs.add(new Bug("Steve", "Spider", 'S', 5, 4, 30, 1));
        bugs.add(new Bug("Charles", "Cockroach", 'C', 3, 9, 30, 2));

        obstacles = new ArrayList<>();
        obstacles.add(new Obstacle("Rock", 'R', 2, 2));
        obstacles.add(new Obstacle("Leaf", 'L', 5, 5));

        plants = new ArrayList<>();
        plants.add(new Plant(10, 4, 5));
    }

    public GameObject objectAtXY(int x, int y) {
        for (Bug b : bugs) {
            if (b.getX() == x && b.getY() == y) {
                return b;
            }
        }
        for (Obstacle o : obstacles) {
            if (o.getX() == x && o.getY() == y) {
                return o;
            }
        }
        for (Plant p : plants) {
            if (p.getX() == x && p.getY() == y) {
                return p;
            }
        }
        return null;
    }

    public void drawWorld() {
        StringBuilder sb = new StringBuilder();
        System.out.print('+');
        for (int i = 0; i < width; i++)
            System.out.print('-');
        System.out.println('+');

        this.bugs.sort(new BugComparator());

//        sb.append("|--------------------|\n");

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
                for (Obstacle o : obstacles) {
                    if (o.x() == x && o.y() == y) {
                        sb.append(o.symbol());
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

    public void updateWorld() {
        String chosenDirection;
        int distance = 5;

        for (Bug b : bugs) {
            chosenDirection = randomDirection();

            if (b.getY() > height || b.getY() <= 0) {
                // nothing
//                System.out.println();
                System.out.println("Bug " + b.getName() + " is at the edge of the world");
            } else {
                b.move(chosenDirection, distance);
                System.out.println("Bug " + b.getName() + " moved " + chosenDirection + " " + distance + " spaces");
            }
        }
    }

    public String randomDirection() {
        String[] directionsArray = {"N", "S", "E", "W"};
        int randomIndex = (int) (Math.random() * directionsArray.length);
        return directionsArray[randomIndex];
    }
}
