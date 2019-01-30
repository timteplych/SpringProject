package ru.ttv.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ttv.springproject.photo.Camera;
import ru.ttv.springproject.shoot.Gun;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
        Camera camera = context.getBean("Camera",Camera.class);
        camera.doPhotograph();

        Gun gun = context.getBean("MiniGun", Gun.class);
        gun.shoot();
    }
}
