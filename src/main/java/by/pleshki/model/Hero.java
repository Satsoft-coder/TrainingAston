package by.pleshki.model;

public abstract class Hero {
    private String name;
    private int health;
    private int damage;

    public String getName() {
        return name;
    }

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой атакует врага");
        enemy.takeDamage(damage);
    }
}
