class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}
class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}
public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3, "Labrador"),
            new Cat("Kitty", 2, "White"),
            new Dog("Rocky", 5, "German Shepherd"),
            new Cat("Milo", 1, "Black")
        };
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Age: " + animal.age);
            animal.makeSound();
            System.out.println();
        }
    }
}