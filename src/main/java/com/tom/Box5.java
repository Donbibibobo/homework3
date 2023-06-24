package com.tom;

public class Box5 {
    public boolean validate(float length, float width, int height) {
        if(length <= 39.5 && width <= 27.5 && height <= 23) {
            return true;
        }else{
            return false;
        }
    }
}
