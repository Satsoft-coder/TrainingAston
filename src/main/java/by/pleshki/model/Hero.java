package by.pleshki.model;

public abstract class Hero implements Mortal{
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
    public boolean isAlive() {
        return health > 0 ? true : false;
    }
}
