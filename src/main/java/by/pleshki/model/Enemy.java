package by.pleshki.model;

public class Enemy {
    private String name;
    private int health;

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public void takeDamage(int damage) {
        if (health <= 0) {
            System.out.println(name + " уже мертв");
        } else {
            health -= damage;
            if (health <= 0) {
                System.out.println(name + " убит");
            }
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

}
