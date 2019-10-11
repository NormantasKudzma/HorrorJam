package com.jam.horrorjam.android;

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

    public int[][] getGrid()
    {
        return grid;
    }
}
