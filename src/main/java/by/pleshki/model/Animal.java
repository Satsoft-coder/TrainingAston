package by.pleshki.model;

public abstract class Animal {
    private final int height;
    private final int weight;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
