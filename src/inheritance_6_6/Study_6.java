package inheritance_6_6;

class Animal {
    public void speak() {
        System.out.println("Animal class");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("wak! wak!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("meow! meow!");
    }
}

public class Study_6 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();
        cat.speak();
    }
}

