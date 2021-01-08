package interface_8.interface_8_5;

public class Exam implements A{
    @Override
    public void speak() {
        System.out.println("Hello");
    }

    public void run() {
        System.out.println("what is this?");
    }

    public static void main(String[] args) {
        A a = new Exam();

//       a.run();  <-- 에러 발생
         A.run();
    }
}
