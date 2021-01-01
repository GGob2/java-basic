package package_7;

import java.sql.SQLOutput;
import java.util.ArrayList;           // import 실습
import static java.lang.Math.random;  // import static 실습
import static java.lang.Math.PI;    

class Access1 {
    int a = 10; // 접근 가능
    private int b = 20; // 접근 불가
    protected int c = 122;
}

class Access2 extends Access1 {
    public void printC() {
        System.out.println(super.c);
    }
}

public class Foo {
    public static void main(String[] args) {
//      ArrayList arrayList = new ArrayList();

        Access1 access1 = new Access1();
        Access2 access2 = new Access2();

        access2.printC();
        System.out.println(access1.a);

    }
}
