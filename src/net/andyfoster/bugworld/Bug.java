package net.andyfoster.bugworld;

public class Bug {

    private String species;
    private String name;
    private char symbol;
    private int x;
    private int y;
    private int energy;
    private int id;

    public Bug(String name, String species, char symbol, int x, int y, int energy, int id) {
        super();
        this.name = name;
        this.species = species;
        this.symbol = symbol;
        this.x = x;
        this.y = y;
        this.energy = energy;
        this.id = id;
    }

    public Bug() {
        super();
        this.species = "Weta";
        this.name = "Gary";
        this.symbol = 'G';
        this.x = 100;
        this.y = 120;
        this.energy = 300;
        this.id = 1;
    }

    public void move(String direction) {
        this.move(direction, 1);
    }

    public void move(String direction, int amount) {

        switch (direction) {
            case "N" -> {
                this.setY(this.getY() - amount);
            }
            case "S" -> {
                this.setY(this.getY() + amount);
            }
            case "E" -> {
                this.setY(this.getX() - amount);
            }
            case "W" -> {
                this.setY(this.getX() + amount);
            }
            default -> {
                throw new IllegalArgumentException("Unexpected value: " + direction);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + " the " + this.species;
    }

    public String toText() {

        return "Name: " + this.name + "\n" +
                "Species: " + this.species + "\n" +
                "Symbol: " + this.symbol + "\n" +
                "X: " + this.x + "\n" +
                "Y: " + this.y + "\n" +
                "Energy: " + this.energy + "\n";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
