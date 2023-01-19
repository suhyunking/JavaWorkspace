package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지 (랜덤 클래스)
        Random random = new Random();
        //int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 : " + random.nextInt());
        //0~10 정수형 값
        System.out.println("랜덤 정수 (범위지정) : " + random.nextInt(10));
        //0.0~1.0 실수값 -> 범위 지정 불가
        System.out.println("랜덤 실수 : " + random.nextDouble());
        //만약 5.0 이상 10.0미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위지정) : " + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        //로또 번호 랜덤 추첨 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        //nextInt(45) : 0 이상 45 미만의 수
        //nextInt(45) + 1 : 1 이상 46 미만의 수 -> 1~45




    }
}
