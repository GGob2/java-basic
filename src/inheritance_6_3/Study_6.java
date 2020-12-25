package inheritance_6_3;

class Dog extends Animal{

    @Override
    public void bark() {
        System.out.println("wak! wak!");
    }
}

class Cat extends Animal {

    @Override
    public void bark() {
        System.out.println("meow! meow!");
    }
}

public class Study_6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.bark();
        cat.bark();

    }
}
