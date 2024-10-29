package by.pleshki.model;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой атакует " + enemy + " магическим шаром");
        enemy.takeDamage(25);
    }
}
