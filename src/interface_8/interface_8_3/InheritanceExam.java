package interface_8.interface_8_3;

import java.sql.SQLOutput;

public class InheritanceExam implements B{
    @Override
    public void speak() {
        System.out.println("Hello!!");
    }

    @Override
    public void run() {
        System.out.println("running!!!!");
    }

    public static void main(String[] args) {
        A a = new InheritanceExam();
        B b = new InheritanceExam();

        System.out.println(a.LENGTH);
        System.out.println(b.LENGTH);
    }


}
