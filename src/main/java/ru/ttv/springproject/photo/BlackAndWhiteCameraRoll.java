package ru.ttv.springproject.photo;

import org.springframework.stereotype.Component;

/**
 * @author Timofey Teplykh
 */
@Component("blackAndWhiteCameraRoll")
public class BlackAndWhiteCameraRoll implements CameraRoll {

    public void processing() {
        System.out.println("-1 черно-белый кадр");
    }

}
