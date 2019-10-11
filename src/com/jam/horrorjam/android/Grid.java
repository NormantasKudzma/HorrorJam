package com.jam.horrorjam.android;

import com.jam.horrorjam.entities.Cat;
import com.ovl.utils.Vector2;

public class Grid
{
    public enum ELEMENTS {EMPTY, HEAD, BODY, TAIL, BLOCK, RAT}

    private int width = 10;
    private int height = 10;
    private int[][] grid = new int[width][height];

    public Grid()
    {
        Init();
        setGridElement(3,4, ELEMENTS.BLOCK);
    }

    private void Init()
    {
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                grid[i][j] = ELEMENTS.EMPTY.ordinal();
            }
        }
    }

    public void setGridElement(int x, int y, ELEMENTS value)
    {
        grid[x][y] = value.ordinal();
    }

    public void clear(int x, int y){
    	grid[x][y] = ELEMENTS.EMPTY.ordinal();
    }

    public boolean isFree(int x, int y){
	    return grid[x][y] == ELEMENTS.EMPTY.ordinal();
    }

    public Vector2 toScreenCoordinates(int x, int y){
    	// stub
	    // Convert x & y to screen coordinates
	    return new Vector2(x *0.1f, y * 0.1f);
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setPosition(Cat cat)
    {
        grid[(int)cat.getPosition().x * 10][(int)cat.getPosition().y * 10] = cat.getElement().ordinal();
    }
}
