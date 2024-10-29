package by.pleshki.model;

public class Mage extends Hero{

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Герой атакует магическим шаром");;
    }
}
