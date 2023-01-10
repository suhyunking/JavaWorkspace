package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
        //단비 매장
        System.out.println("어서오세요. 단비입니다.");
        //또 다른 손님이 들어오면?
        System.out.println("어서오세요. 단비입니다.");
        System.out.println("어서오세요. 단비입니다.");
        System.out.println("어서오세요. 단비입니다.");
        System.out.println("어서오세요. 단비입니다.");

        //만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 단비입니다.");
        System.out.println("환영합니다. 단비입니다.");
        System.out.println("환영합니다. 단비입니다.");
        System.out.println("환영합니다. 단비입니다.");

        //만약에 이름이 바뀌면?
        System.out.println("환영합니다. 당비입니다.");
        System.out.println("환영합니다. 당비입니다.");
        System.out.println("환영합니다. 당비입니다.");
        System.out.println("환영합니다. 당비입니다.");

        //반복문 사용 For
//        for (선언; 조건; 증감) {
//            수행 명령...
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 단비입니다." + i);
        }

        //짝수만 출력
        for (int i = 0; i < 10; i+= 2) {
            System.out.print(i);
        }
        System.out.println();
        //홀수만 출력
        for (int i = 1; i < 10; i+= 2) {
            System.out.print(i);
        }
        System.out.println();
        //거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        //1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1;
            System.out.println("현재까지의 총합 : " + sum);
        }
        System.out.println("총합 : " + sum);
    }

}
