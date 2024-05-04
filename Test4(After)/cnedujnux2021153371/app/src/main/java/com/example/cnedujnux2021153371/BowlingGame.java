package com.example.cnedujnux2021153371;
public class BowlingGame {
    int pins[]=new int[21];
    int currentPinIndex=0;
    public void roll(int pin) {
        pins[currentPinIndex++]=pin;
    }

    public int score() {
        int totalscore = 0;
        for(int scoreIndex=0;scoreIndex<pins.length;scoreIndex++) {
            totalscore+=pins[scoreIndex];
            if(scoreIndex<19) {
                if (isaSpare(scoreIndex)) {
                    totalscore += pins[scoreIndex + 2];
                }
                if (isaStrike(scoreIndex)) {
                    totalscore += pins[scoreIndex + 1];
                    totalscore += pins[scoreIndex + 2];
                }
            }
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



