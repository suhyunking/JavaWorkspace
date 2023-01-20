package chap_08.camera;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진 촬영");
    }

    public void recordVideo() {
        System.out.println("영상 녹화");
    }


    public abstract void showMainFeature(); //구현해야 하는 메소드

    public abstract int read(CharBuffer cb) throws IOException;
}
