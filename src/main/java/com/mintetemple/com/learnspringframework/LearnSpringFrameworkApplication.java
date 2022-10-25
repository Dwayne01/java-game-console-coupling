package com.mintetemple.com.learnspringframework;
import com.mintetemple.com.learnspringframework.game.GameRunner;
import com.mintetemple.com.learnspringframework.game.MarioGame;
import com.mintetemple.com.learnspringframework.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
