package com.jam.horrorjam.entities;

import com.jam.horrorjam.Game;
import com.jam.horrorjam.android.Grid;
import com.jam.horrorjam.utils.Arrays;
import com.jam.horrorjam.utils.IntPair;
import com.ovl.game.GameObject;
import com.ovl.graphics.Layer;
import com.ovl.graphics.Sprite;
import com.ovl.utils.OverloadRandom;
import com.ovl.utils.Paths;

public class Mouse extends GameObject {
	private Grid grid;
	private int moveAfterTurns;
	private IntPair position;

	public Mouse(Grid grid, IntPair position){
		super(Game.get());
		this.position = position;
		this.grid = grid;
		setSprite(new Sprite(Paths.getResources() + "mouse.png"));
		setPosition(grid.toScreenCoordinates(position.x, position.y));
		waitForNextMove();
	}

	public void die(Layer layer){
		layer.removeObject(this);
	}

	public void move(){
		if (--moveAfterTurns > 0){ return; }

		waitForNextMove();
		IntPair[] moves = makeMoves();
		for (IntPair move : moves){
			if (isMoveValid(move)){
				grid.clear(position.x, position.y);
				grid.setGridElement(move.x, move.y, Grid.ELEMENTS.RAT);
				setPosition(grid.toScreenCoordinates(position.x, position.y));
				break;
			}
		}
	}

	private void waitForNextMove(){
		moveAfterTurns = OverloadRandom.next(5);
	}

	private IntPair[] makeMoves(){
		return Arrays.shuffle(new IntPair[]{
			new IntPair(this.position.x + 1, this.position.y + 0),
			new IntPair(this.position.x - 1, this.position.y + 0),
			new IntPair(this.position.x + 0, this.position.y + 1),
			new IntPair(this.position.x + 0, this.position.y - 1),
		});
	}

	private boolean isMoveValid(IntPair move){
		return this.grid.isFree(move.x, move.y);
	}
}
