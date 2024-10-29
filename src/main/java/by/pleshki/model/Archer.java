package by.pleshki.model;

public class Archer extends Hero{
    @Override
    public void attackEnemy() {
        System.out.println("герой стреляет из лука");
    }

    public Archer(String name) {
        super(name);
    }
}
