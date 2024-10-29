package by.pleshki.model;

public class Archer extends Hero {
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("герой " + getName() + " стреляет в " + enemy + " из лука");
        enemy.takeDamage(getDamage());
    }

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

}
