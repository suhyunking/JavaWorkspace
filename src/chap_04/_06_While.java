package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        //수영장에서 수영하는 모습
        int distance = 25; //전체거리 25m
        int move = 0; //현재 이동 거리 0m
        while (move < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; //3미터 이동
        }

        System.out.println("도착");
    }
}
