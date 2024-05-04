package com.example.cnedujnux2021153371;
public class BowlingGame {
    int score=0;
    public void roll(int pin) {
        score+=pin;
    }

    public int score() {
        return score;
    }
}
