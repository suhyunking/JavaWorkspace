package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("좋아요");

        // \n 줄바꿈
        System.out.println("자바가\n너무\n좋아요");


        // \t 탭
        System.out.println("해물파전\t 9000원");
        System.out.println("감자전\t 9000원");
        System.out.println("김치전\t 9000원");

        // \\ 역슬래시
        System.out.println("c:\\Program Files\\Java");

        // \"
        //단비가 "멍멍" 이라고 했어요
        System.out.println("단비가 \"멍멍\" 이라고 했어요");

        // \'
        //단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c); // '
    }
}
