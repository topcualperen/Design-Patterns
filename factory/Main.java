package factory;

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("hav hav");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Miyavv");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Bilinmeyen hayvan");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== FACTORY PATTERN ===");
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");
        dog.makeSound();
        cat.makeSound();
    }
}
