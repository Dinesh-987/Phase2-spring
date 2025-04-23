package com.fem.play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fem.folder.Game;

@Component
public class Playstation {
	
	 // @Autowired
	  
	 // @Qualifier("game1") 
	  Game game;
	 
	  @Autowired
	  
	  public void setGame(@Qualifier("game2") Game game) {
		  this.game=game;
	  }
	
	/*
	 * Playstation (@Qualifier("game1")Game game){ this.game=game; }
	 */
	public void play() {
		System.out.println("The game starts now!");
		System.out.println("Game:"+game.getName());
		System.out.println(game.getspace());
	}
}
