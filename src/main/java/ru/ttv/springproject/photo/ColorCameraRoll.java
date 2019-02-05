package ru.ttv.springproject.photo;

import org.springframework.stereotype.Component;
import ru.ttv.springproject.annotation.UnproducableCameraRoll;

/**
 * @author Timofey Teplykh
 */
@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass = BlackAndWhiteCameraRoll.class)
public class ColorCameraRoll implements CameraRoll {

    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}
