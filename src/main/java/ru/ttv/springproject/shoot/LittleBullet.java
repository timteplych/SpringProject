package ru.ttv.springproject.shoot;

import org.springframework.stereotype.Component;

/**
 * @author Timofey Teplykh
 */
@Component("littleBullet")
public class LittleBullet implements Bullet {

    public void shoot() {
        System.out.println("Little bullet shoot");
    }

}
