package by.pleshki.model;

public class SuperEnemy extends Enemy {

    public SuperEnemy(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void takeDamage(int damage) {
        if (!isAlive()) {
            System.out.println(getName() + " зомби и его разбудили, здоровье " + getHealth());
            setHealth(50);
        } else {
            setHealth(getHealth() - damage);
            if (!isAlive()) {
                setHealth(0);
                System.out.println(getName() + " убит");
            } else System.out.println("У " + getName() + " осталось " + getHealth() + " здоровья");
        }
    }

}
