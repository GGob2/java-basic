package interface_8.interface_8_1;

public class Student implements Pencil{
    public static void main(String[] args) {
        System.out.println("this is student class");
    }
    @Override
    public void writeEnglish(String englishSentence) {
        System.out.println("this is English sentence");
    }

    @Override
    public void writeKorean(String hangulSentence) {
        System.out.println("this is Korean sentence");
    }

    @Override
    public void broke() {
        System.out.println("Ouch! it's broken");
    }
}


