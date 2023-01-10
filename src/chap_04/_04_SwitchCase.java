package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        //석차에 따른 장학금 지급
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외 : 장학금 대상 아님

        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) { //  } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용
    /*    switch (expression) {
            case A : ... 수행할 명령
                break;
            case B : ... 수행할 명령
                break;
            case C : ... 수행할 명령
                break;
                ...
            default : ... 수행할 명령
         }
     */

        ranking = 3;
        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

    //명확한 값이 있을 경우에는 switch 문을
    //범위에 해당하는 값을 쓸 경우에는 if 문을 사용한다.
        //중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        //1등급 : 10000원
        //2등급 : 9000원
        //3등급 : 8000원
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

        int score = 95;
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
    }
}
