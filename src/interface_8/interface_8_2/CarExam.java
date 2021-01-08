package interface_8.interface_8_2;

public class CarExam {
    public static void main(String[] args) {
        Car morning = new Morning();
        Car sonata = new Sonata();

        showBrand(morning);
        showBrand(sonata);

    }
    public static void showBrand(Car car) {
        car.speakCarBrand();
    }
}
