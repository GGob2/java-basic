package interface_8.interface_8_2;

public class Sonata implements Car{
    @Override
    public void speakCarName() {
        System.out.println("I am Sonata");
    }

    @Override
    public void speakCarBrand() {
        System.out.println("I'm in Hyundai!");
    }
}
