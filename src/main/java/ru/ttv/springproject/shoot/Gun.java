package ru.ttv.springproject.shoot;

/**
 * @author Timofey Teplykh
 */
public interface Gun {

    Bullet getBullet();
    void setBullet(Bullet bullet);
    void shoot();

}
