package chap_01;

public class _03_Variables {

    public static void main(String[] args) {

        String name;
        name = "김수현";
        int hour = 15;
        
//        System.out.println("김수현님, 배송 시작");
//        System.out.println("김수현님, 15시 배송 완료");

        System.out.println(name + "님, 배송 시작");
        System.out.println(name + "님, " + hour + "배송 완료");

        double score = 90.5;
        char grade = 'A';
        name = "나수현";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");


        boolean pass = true;
        System.out.println("이번 시험에 합격했는가? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
