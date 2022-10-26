package com.mintetemple.com.learnspringframework.game;

import com.mintetemple.com.learnspringframework.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("MarioGame jump");
    }

    public void down() {
        System.out.println("MarioGame down in a hole");
    }

    public void left() {
        System.out.println("MarioGame stop");
    }


    public void right() {
        System.out.println("MarioGame accelerate");
    }
}
