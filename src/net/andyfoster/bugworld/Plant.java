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

    @Override
    public void setX(int x) {
        
    }

    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {

    }

    @Override
    public char getSymbol() {
        return 0;
    }

    @Override
    public void setSymbol(char symbol) {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
