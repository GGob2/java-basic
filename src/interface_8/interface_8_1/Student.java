package interface_8.interface_8_1;

public class Student implements Pencil{
    public static void main(String[] args) {
        System.out.println("this is student class");
    }

    @Override
    public void shout() {
        System.out.println("this is implemented by Pencil Interface");
    }
}
