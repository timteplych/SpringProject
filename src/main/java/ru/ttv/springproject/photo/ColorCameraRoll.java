package ru.ttv.springproject.photo;

import org.springframework.stereotype.Component;

/**
 * @author Timofey Teplykh
 */
@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll {

    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}
