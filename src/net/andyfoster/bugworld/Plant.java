package net.andyfoster.bugworld;

public class Plant implements GameObject {
    private final int x;
    private final int y;
    private int size;

    public Plant(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
