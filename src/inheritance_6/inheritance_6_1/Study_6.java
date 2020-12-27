package inheritance_6.inheritance_6_1;

class Mother {
    int motherAge = 50;

    public Mother(){
        System.out.println("welcome to super class");
    }

}

class Son extends Mother{
    int sonAge = 23;

    public Son(){
        System.out.println("welcome to sub class");
    }

    public void printMotherAge() {
        System.out.println("Mother's Age : " + super.motherAge);
    }
}
public class Study_6 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Son son = new Son();
        son.printMotherAge();
    }
}
