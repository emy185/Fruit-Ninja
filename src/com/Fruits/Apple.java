package com.Fruits;

import com.GameControllers.ENUM;
import com.GameControllers.GameObject;

public class Apple extends Fruit {
    public Apple(){
        points = 20;
        setType(ENUM.APPLE);
        setSliced(false);
    }



}
