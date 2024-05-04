package com.example.cnedujnux2021153371;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }
    private void RepeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }
    @Test
    public void testFullStrike() {
        RepeatedRoll(10, 12);
        assertEquals(300, game.score());
    }

}