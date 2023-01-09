package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf
        //한라봉 주스가 있으면 +1
        //또는 망고 주스가 있으면 +1
        //또는 아이스 아메리카노 +1

        boolean hallabongJuice = true;
        boolean mangoJuice = true;

        if (hallabongJuice) {
            System.out.println("한라봉 주스 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //else if 는 여러번 사용 가능, else는 없어도 가능
        hallabongJuice = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongJuice) {
            System.out.println("한라봉 주스 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
