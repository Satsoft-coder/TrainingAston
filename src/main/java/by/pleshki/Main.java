package by.pleshki;

import by.pleshki.model.Animal;
import by.pleshki.model.Dog;
import by.pleshki.model.Kitty;
import by.pleshki.utilite.ArrayListAnalog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(12, 15, "Sharik");
        Dog dog2 = new Dog(11, 10, "Polkan");
        Kitty kitty1 = new Kitty(11, 2, "Pushok", "Pers");

        ArrayListAnalog<Animal> animalList1 = new ArrayListAnalog<>();
        animalList1.add(dog1);
        animalList1.add(dog2);
        animalList1.add(dog2);
        animalList1.add(kitty1);
        animalList1.add(dog1);
        animalList1.add(dog2);
        animalList1.add(dog2);
        animalList1.trim();
        animalList1.add(kitty1);
        animalList1.add(dog1);
        animalList1.add(dog2);
        animalList1.add(dog2);
        animalList1.add(kitty1);

        ArrayListAnalog<Integer> arrayListAnalog1 = new ArrayListAnalog<>(1);
        for (int i = 0; i < 50; i++) {
            arrayListAnalog1.add(i);
        }

        ArrayListAnalog<Character> character = new ArrayListAnalog<>();
        character.add('a');
        character.add('b');
        character.add('c');
        character.add('d');
        character.add('e');
        character.add('f');
        character.add('g');

        character.add(2, 'Z');
        character.add(7,'S');
        character.add(9, 'Y');
        character.add('O');

        System.out.println(character.toString());
        System.out.println(animalList1.toString());
        System.out.println(animalList1.getSize());

        System.out.println(arrayListAnalog1.toString());
        arrayListAnalog1.remove(2);
        System.out.println(arrayListAnalog1.toString());

        character.remove('d');
        System.out.println(character.toString());
    }
}