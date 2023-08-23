package net.andyfoster.bugworld;

//public record Obstacle(String name, char symbol, int x, int y) extends GameObject {}

public class Obstacle extends GameObject {
    private final String name;
    private final char symbol;
    private final int x;
    private final int y;

    public Obstacle(String name, char symbol, int x, int y) {
        this.name = name;
        this.symbol = symbol;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
