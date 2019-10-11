package com.jam.horrorjam;

import java.util.ArrayList;

import com.ovl.game.BaseGame;
import com.ovl.utils.Vector2;

public class Game extends BaseGame {
	public static interface Platform {
		public void init();
		public String getVersion();
		public int getBuild();
	}

	public State state;
	public Platform platform;
	private ArrayList<Vector2> clickList;
	private static Game instance;
	
	public int getBuild() {
		return platform.getBuild();
	}
	
	public String getVersion() {
		return platform.getVersion();
	}
	
	@Override
	public void init() {
		super.init();
		instance = this;
		
		clickList = new ArrayList<>();
		state = new GameState(this);
		state.start();
		
		if (platform != null){
			platform.init();
		}
	}
	
	public void postClick(Vector2 pos){
		synchronized (clickList){
			clickList.add(pos);
		}
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		synchronized (clickList){
			for (Vector2 click : clickList){
				state.onClick(click);
			}
			clickList.clear();
		}
		
		state.update(deltaTime);
	}

	public static Game get(){
		return instance;
	}
}
