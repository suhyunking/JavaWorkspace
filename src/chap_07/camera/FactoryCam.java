package chap_07.camera;

public class FactoryCam extends Camera { //자식 클래스
//    public String name;

    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }

//    public void takePicture() {
//        //사진 촬영
//        System.out.println("사진 촬영");
//    }
//
//    public void recordVideo() {
//        //동영상 녹화
//        System.out.println("동영상 녹화");
//    }
    public void recordVideo() {
        //동영상 녹화
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        //화재 감지
        System.out.println("화재를 감지");
    }


    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지기");
    }



}
