package by.pleshki.model;

public class Enemy implements Mortal {
    private String name;
    private int health;
    private int damage;

    @Override
    public boolean isAlive() {
        return health > 0 ? true : false;
    }

    @Override
    public String toString() {
        return "Враг " + name + ", health=" + health;
    }

    public void takeDamage(int damage) {
        if (!isAlive()) {
            System.out.println(name + " уже мертв");
        } else {
            health -= damage;
            if (!isAlive()) {
                health = 0;
                System.out.println(name + " убит");
            }else System.out.println("У "+name+" осталось "+health+" здоровья");
        }
    }

    public void attackHero(Hero hero) {
        System.out.println("Враг атакует героя");
        hero.takeDamage(damage);
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

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

}
