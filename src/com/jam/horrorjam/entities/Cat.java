package com.jam.horrorjam.entities;

import com.jam.horrorjam.android.Grid;
import com.ovl.utils.Vector2;

public class Cat
{
    private Vector2 pos = new Vector2();
    private Grid.ELEMENTS element = Grid.ELEMENTS.HEAD;

    public Cat(float x, float y)
    {
        pos.x = x;
        pos.y = y;
    }

    public Cat(Vector2 vec)
    {
        pos = vec;
    }

    public Vector2 getPosition()
    {
        return pos;
    }

    public Grid.ELEMENTS getElement()
    {
        return element;
    }

    public void move(Vector2 pos)
    {
        this.pos = pos;
    }
}
