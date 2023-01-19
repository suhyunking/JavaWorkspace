package chap_07.camera;

public class ActionCam extends Camera {
    //    public final String lens = "광각렌즈";
    public final String lens;
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : "
                + this.lens + " 액션 비디오를 제작");
    }
}
