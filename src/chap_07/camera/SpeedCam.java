package chap_07.camera;

public class SpeedCam extends Camera { //자식 클래스
//    public String name;

    public SpeedCam() {
//        this.name = "과속 단속 카메라";
        super("과속 단속 카메라");
    }

//    public void takePicture() {
//        //사진촬영
//        System.out.println("사진 촬영");
//    }
//
//    public void recordVideo() {
//        //동영상 녹화
//        System.out.println("동영상 녹화");
//    }

    public void takePicture() {
//        //사진 촬영
//        System.out.println(this.name + " : 사진 촬영");
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        //속도 체크
        System.out.println("속도를 측정");

    }

    public void recognizeLicensePlate() {
        //번호 인식
        System.out.println("차량 번호를 인식");
    }

    @Override //annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 속도측정, 번호 인식");
    }

}
