package by.pleshki.model;

public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Герой атакует врага");
        enemy.takeDamage(40);
    }
}
