package factory;

// 2. FACTORY PATTERN
// Nesne oluşturma işlemini bir factory sınıfına devreder

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
        if (type == null || type.isEmpty()) return null;
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
