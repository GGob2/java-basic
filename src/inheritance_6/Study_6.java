package inheritance_6;

class Mother {
    public Mother(){
        System.out.println("welcome to super class");
    }
}

class Son extends Mother{
    public Son(){
        System.out.println("welcome to sub class");
    }
}
public class Study_6 {
    public static void main(String[] args) {
        Mother mother = new Mother();
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Son son = new Son();
    }
}
