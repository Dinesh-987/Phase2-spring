package com.fem.gameconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fem.folder.Game;

@Configuration
@ComponentScan("com.fem")

public class GameConfig {

	@Bean
	public Game game1(){
		Game game1=new Game();
		game1.setName("Froza5");
		game1.setSpace("60-GB");
		return game1;
	}
	@Bean
	public Game game2() {
		Game game2=new Game();
		game2.setName("G.O.W");
		game2.setSpace("80-GB");
		return game2;
	}
	
	
}
