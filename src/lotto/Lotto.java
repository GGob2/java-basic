package lotto;


import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int lottoNum[] = new int [6];

        for(int k=0; k<4; k++) {
            // 번호 생성
            for (int i = 0; i < 6; i++) {
                lottoNum[i] = (int) (Math.random() * 45) + 1;

                // 중복 번호 제거
                for (int j = 0; j < i; j++) {
                    if (lottoNum[i] == lottoNum[j]) {
                        i--;
                        break;
                    }
                }
            }


            Arrays.sort(lottoNum);

            // 번호 출력
            System.out.print(k+1+"회차 로또 번호: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(lottoNum[i] + " ");
            }
            System.out.println("");
        }
    }
}