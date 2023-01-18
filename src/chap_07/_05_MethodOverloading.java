package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.record(false, false, 10);
        System.out.println("--------------");
        b1.record(true, false, 10);
        System.out.println("--------------");
        b1.record(true, true, 5);


        String s = "BlackBox";
        //BlackBox에서 "a"가 몇번째에 있는가 -> 2
        System.out.println(s.indexOf("a"));
    }
}
