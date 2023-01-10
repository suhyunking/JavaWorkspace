package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //continue

        //치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        //For
        int max = 20; //최대 치킨 수
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 노쇼 번호
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님 치킨 나옴");
            //손님이 없다면 ? noShow
            if (i == noShow) {
                System.out.println(i + "번 손님 없음. 다음 차례로 넘어감");
                continue;
            }
            sold++; //판매 처리
            if (sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");
        System.out.println("----------");
        // While 문
        sold = 0;
        int index = 0; //손님 번호
        //while (index < 50) {
        while (true) {
            index++;
            System.out.println(index + "번 손님 치킨 나옴");

            //손님이 없다면 ? noShow
            if (index == noShow) {
                System.out.println(index + "번 손님 없음. 다음 차례로 넘어감");
                continue;
            }

            sold++; //판매 처리

            if (sold == max) {
                System.out.println("재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");
    }
}
