package com.mintetemple.com.learnspringframework.game;

import com.mintetemple.com.learnspringframework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacGame implements GamingConsole {

    public void up() {
        System.out.println("PacmanGame jump");
    }

    public void down() {
        System.out.println("PacmanGame down in a hole");
    }

    public void left() {
        System.out.println("PacmanGame stop");
    }


    public void right() {
        System.out.println("PacmanGame accelerate");
    }
}
