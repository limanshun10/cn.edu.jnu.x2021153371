package com.example.cnedujnux2021153371;
public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int pin) {
        pins[currentPinIndex++]=pin;
    }

    public int score() {
        int totalscore = 0;
        int currentFrameScoreIndex = 0;
        for(int currentFrame=0;currentFrame<10;currentFrame++) {
            totalscore+= pins[currentFrameScoreIndex];
            totalscore += pins[currentFrameScoreIndex + 1];
            if (isaStrike(currentFrameScoreIndex)) {
                totalscore += pins[currentFrameScoreIndex + 2];
            } else if (isaSpare(currentFrameScoreIndex)) {
                totalscore += pins[currentFrameScoreIndex + 2];
                currentFrameScoreIndex++;
            }
            else{
                currentFrameScoreIndex++;
            }
            currentFrameScoreIndex++;
        }
        return totalscore;
    }

    private boolean isaSpare(int scoreIndex) {
        return 10 == pins[scoreIndex] + pins[scoreIndex + 1];
    }
    private boolean isaStrike(int scoreIndex) {
        return 10 == pins[scoreIndex] ;
    }
}


