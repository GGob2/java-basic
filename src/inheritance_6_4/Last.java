package inheritance_6_4;

public class Last {
    final int MONTH = 10;   // 필드에는 초기화 값이 항상 존재해야 함

    final void returnMonth() { // 메소드에는 body가 항상 존재해야 함
        System.out.println(MONTH);
    }
}
