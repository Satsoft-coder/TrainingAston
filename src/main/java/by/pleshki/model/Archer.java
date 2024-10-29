package by.pleshki.model;

public class Archer extends Hero{
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой стреляет из лука");
        enemy.takeDamage(22);
    }

    public Archer(String name) {
        super(name);
    }
}
