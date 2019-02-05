package ru.ttv.springproject.shoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Timofey Teplykh
 */
@Component("MiniGun")
public class MiniGun implements Gun {

    @Autowired
    @Qualifier("littleBullet")
    private Bullet bullet;

    public void shoot() {
        System.out.println("shooting...");
        bullet.shoot();
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
