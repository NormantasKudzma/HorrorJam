package com.jam.horrorjam.android;

import com.ovl.utils.Vector2;

public class Grid
{
    public enum ELEMENTS {EMPTY, HEAD, BODY, TAIL, BLOCK, RAT};

    private int size = 10;
    private int[][] grid = new int[size][size];

    public Grid()
    {
        Init();
    }

    private void Init()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
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
	    return new Vector2(0.0f, 0.0f);
    }

    public int[][] getGrid()
    {
        return grid;
    }
}
