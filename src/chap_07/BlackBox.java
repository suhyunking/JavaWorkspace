package chap_07;

public class BlackBox {
    //인스턴스 변수
    String modelName;
    String resolution;
    int price;
    String color;

    int serialNumber; //시리얼 번호

    // 시리얼 번호를 생성해주는 역할 ( 처음에는 0이었다가 ++을 통해 값 증가)
    static int counter = 0;

    static boolean canAutoReport = false; // 자동 신고 기능

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버 발급 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); //기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동 신고");
        }
        else {
            System.out.println("자동 신고 기능 지원 불가");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드 삽입 완료");
        System.out.println("용량은 " + capacity + "GB");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반 영상
            return 9;
        } else if (type == 2) { //이벤트 영상
            return 1;
        }
        return 10;
    }

    //인스턴스 매소드
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시");
        }
        System.out.println("영상은 " + min + "분 단위로 기록");
    }

    //클래스 매소드
    static void callServiceCenter() {
        System.out.println("서비스 센터로 연결");

    }

    void appendModelName(String modelName) {
        //이름이 똑같으면 this를 붙인다.
        //this.modelName -> 클래 인스턴스
        //modelName -> 파라미터 전달받은 modelName
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

}

