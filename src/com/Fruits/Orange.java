package com.Fruits;

import com.GameControllers.ENUM;

public class Orange extends Fruit {
    public Orange(){
        points = 20;
        setType(ENUM.ORANGE);
        setSliced(false);
    }
}
