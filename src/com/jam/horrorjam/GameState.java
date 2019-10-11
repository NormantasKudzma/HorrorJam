package com.jam.horrorjam;

import java.util.ArrayList;

import com.jam.horrorjam.android.Grid;
import com.ovl.engine.OverloadEngine;
import com.ovl.engine.Renderer;
import com.ovl.game.GameObject;
import com.ovl.graphics.Color;
import com.ovl.graphics.CustomFont;
import com.ovl.graphics.Layer;
import com.ovl.graphics.Primitive;
import com.ovl.graphics.SimpleFont;
import com.ovl.graphics.SortedLayer;
import com.ovl.graphics.Sprite;
import com.ovl.graphics.UnsortedLayer;
import com.ovl.utils.FastMath;
import com.ovl.utils.Paths;
import com.ovl.utils.Vector2;

public class GameState implements State {
	private Game game;

	public GameState(Game game){
		this.game = game;

	}
	
	@Override
	public void start() {

		Grid grid1 = new Grid();

		grid1.setGridElement(3,4, Grid.ELEMENTS.HEAD);
		/*
		cat = new GameObject(game);
		game.addObject(cat);
		cat.setSprite(new Sprite(Paths.getResources().concat("cat.jpg")));

		pnk5 = new GameObject(game);

		Layer newLayer = new SortedLayer("bg", 100);
		game.addLayer(newLayer);

		newLayer.addObject(pnk5);


		Primitive prm = new Primitive(new Vector2[]
				{
						new Vector2(0,0),
						new Vector2(0.5f,0),
						new Vector2(0.5f,0.5f),
						new Vector2(-0.5f,0.5f)
				}, Renderer.PrimitiveType.Polygon);
		prm.setColor(new Color(1,1,1));

		pnk5.setSprite(prm);
		 */
	}

	@Override
	public void finish() {

	}

	@Override
	public void update(float deltaTime) {

	}

	@Override
	public void onClick(Vector2 pos) {
	}
}
