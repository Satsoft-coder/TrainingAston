package by.pleshki.model;

public class Kitty extends Animal {
    private String name;
    private String breed;

    public Kitty (int height, int weight, String name, String breed) {
        super(height, weight);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Kitty{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
