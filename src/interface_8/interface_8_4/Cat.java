package interface_8.interface_8_4;

public class Cat implements Animal{
    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Animal cat = new Cat();

        cat.findMyFriend("Dog");
    }
}
