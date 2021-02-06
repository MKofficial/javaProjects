package programko_rak.animals;

/**
 * @since 4-10-2020
 * @author Matthew Kriz
 * @version 1.0.0
 */

public class Animal {
    protected String name, kind, breed;
    protected int age;

    public Animal() {
        name = "unknown";
        age = 0;
        kind = "unknown";
    }

    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("I am " + kind);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKind(String breed) {
        this.kind = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
