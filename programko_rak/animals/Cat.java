package programko_rak.animals;

/**
 * This class creates a "programko_rak.animals.Cat" object
 *
 * @since 2020-09-18
 * @author Matthew Kriz
 * @version 1.1.0
 */

public class Cat extends Animal{
    private boolean domestic;

    public Cat(String name, int age) {
        kind = "Cat";
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void meow() {
        System.out.println(name + "is doing meow");
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

}