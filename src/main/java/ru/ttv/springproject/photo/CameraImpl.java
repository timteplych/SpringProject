package ru.ttv.springproject.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Timofey Teplykh
 */
@Component("Camera")
public class CameraImpl implements Camera {

    @Autowired
    @Qualifier("blackAndWhiteCameraRoll")
    private CameraRoll cameraRoll;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Сделана фотография!");
        cameraRoll.processing();
    }
}
