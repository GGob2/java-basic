package inheritance_6.inheritance_6_5;

class Mother {
    int motherAge = 50;

    public void printAge() {
        System.out.println("I'm " + motherAge);
    }

}

class Son extends Mother{
    int sonAge = 23;

    @Override
    public void printAge() {
        System.out.println("I'm " + sonAge);
    }
}
public class Study_6 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Son son = new Son();

        mother.printAge();
        son.printAge();
    }
}
