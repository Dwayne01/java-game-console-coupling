package com.mintetemple.com.learnspringframework.game;

import com.mintetemple.com.learnspringframework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

    public void up() {
        System.out.println("SuperContraGame jump");
    }

    public void down() {
        System.out.println("SuperContraGame down in a hole");
    }

    public void left() {
        System.out.println("SuperContraGame stop");
    }


    public void right() {
        System.out.println("SuperContraGame accelerate");
    }
}
