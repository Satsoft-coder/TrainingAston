package by.pleshki.model;

public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println("Герой атакует врага");;
    }
}
