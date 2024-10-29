package by.pleshki;

import by.pleshki.model.Archer;
import by.pleshki.model.Hero;
import by.pleshki.model.Mage;
import by.pleshki.model.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 =new Hero("Рембо");
        hero1.attackEnemy();

        Warrior warrior1=new Warrior("Иван Сусанин");
        warrior1.attackEnemy();

        Mage mage1=new Mage("Баба Яга");
        mage1.attackEnemy();

        Archer archer1=new Archer("Robin Hood");
        archer1.attackEnemy();
    }
}