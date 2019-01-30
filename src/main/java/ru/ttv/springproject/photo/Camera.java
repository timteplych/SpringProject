package ru.ttv.springproject.photo;

/**
 * @author Timofey Teplykh
 */
public interface Camera {

    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhotograph();

}
