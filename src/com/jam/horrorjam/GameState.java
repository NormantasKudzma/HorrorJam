package com.jam.horrorjam;

import com.jam.horrorjam.entities.Cat;
import com.jam.horrorjam.android.Grid;
import com.jam.horrorjam.entities.Mouse;
import com.jam.horrorjam.utils.IntPair;
import com.ovl.game.GameObject;
import com.ovl.graphics.Sprite;
import com.ovl.utils.Paths;
import com.ovl.utils.Vector2;

public class GameState implements State {
	private Game game;
	private Mouse mouse;

	private GameObject catObj = null;

	public GameState(Game game){
		this.game = game;

	}
	
	@Override
	public void start() {

		Grid grid1 = new Grid();

		Cat cat = new Cat(new Vector2(0.5f, -0.8f));

		grid1.setPosition(cat);

		mouse = new Mouse(grid1, new IntPair(2,2));
		game.addObject(mouse);

		catObj = new GameObject(game);
		game.addObject(catObj);
		catObj.setSprite(new Sprite(Paths.getResources().concat("cat.jpg")));
		catObj.setPosition(cat.getPosition());

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
	public void onClick(Vector2 pos)
	{
		mouse.move();
	}
}
