package com.jam.horrorjam;

import com.ovl.utils.Vector2;

public interface State {
	public void start();
	public void finish();
	public void update(float deltaTime);
	public void onClick(Vector2 pos);
}
