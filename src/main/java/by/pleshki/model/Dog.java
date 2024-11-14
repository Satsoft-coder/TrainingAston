package by.pleshki.model;

public class Dog extends Animal {
    private String name;

    public Dog(int height, int weight, String name) {
        super(height, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
