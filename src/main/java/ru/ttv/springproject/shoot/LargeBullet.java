package ru.ttv.springproject.shoot;

import org.springframework.stereotype.Component;

/**
 * @author Timofey Teplykh
 */
@Component("largeBullet")
public class LargeBullet implements Bullet {

    public void shoot() {
        System.out.println("Large bullet shoot");
    }

}
