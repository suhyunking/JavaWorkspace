package chap_07.camera;

public class Camera {//부모 클래스
    public String name;

    public Camera() {
        this("과속 단속 카메라");

    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        //사진 촬영
        System.out.println(this.name + " : 사진 촬영");
    }

    public void recordVideo() {
        //동영상 녹화
        System.out.println(this.name + " : 동영상 녹화");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 활영, 영상 녹화");
    }
}
