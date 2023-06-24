package com.tom;

public class Box3 {
    public boolean validate(float length, float width, int height) {
        if(length <= 23 && width <=14 && height <= 13) {
            return true;
        }else{
            return false;
        }
    }
}
