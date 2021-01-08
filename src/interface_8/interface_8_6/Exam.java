package interface_8.interface_8_6;

public class Exam implements I{
    public static void main(String[] args) {
        I i = new Exam();

//      i.run();
//      i.speak();        <-- 둘 다 에러 발생

        I.speakMyName("GGOB2");
    }
}
