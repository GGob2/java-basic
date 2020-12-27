package inheritance_6.inheritance_6_2;

class Mother {
    int motherAge = 50;

//    public Mother(){
//        System.out.println("welcome to super class");
//    }

    public void speak() {
        System.out.println("I am Mother!");
    }
}

class Son extends Mother{
    int sonAge = 23;

//    public Son(){
//        System.out.println("welcome to sub class");
//    }

    @Override
    public void speak() {
        System.out.println("I am Son!");
    }

}
public class Study_6 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Son son = new Son();

        mother.speak();
        son.speak();

    }
}
