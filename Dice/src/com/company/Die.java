package com.company;

public class Die {
    int value;


    public Die() {
        value = 0;
    }

    public void roll() {
        int R = (int) (Math.random() * 6 + 1);
        value = R;
    }

    int readResult() {
        return value;
    }
}
