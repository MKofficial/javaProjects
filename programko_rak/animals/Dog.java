package programko_rak.animals;

/**
 * This class creates a "programko_rak.animals.Dog" object
 *
 * @since 2020-16-09
 * @author Matthew Kriz
 * @version 1.1.0
 */

public class Dog extends Animal {

    public Dog(String name, int age) {
        kind = "Dog";
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + "is barking");
    }
}