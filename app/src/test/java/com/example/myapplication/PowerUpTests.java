package com.example.myapplication;

import static org.junit.Assert.assertEquals;

import com.example.myapplication.model.Player;

import org.junit.Before;
import org.junit.Test;


public class PowerUpTests {

    private Player player;
    @Before
    public void setUp() {
        player = Player.getPlayer();
    }
    @Test
    public void testGainPowerUpForSpeed() {
        float score = 5;
        String powerUp = "Speed";
        player.gainPowerUp(powerUp, player);
        assertEquals(score, player.getScore(), 0.1f);

    }

    @Test
    public void testGainPowerUpForStrength() {
        String powerUp = "Strength";
        player.gainPowerUp(powerUp, player);
        assertEquals(10,player.getScore(), 0.1f);
    }

    @Test
    public void testGainPowerUpForDefault() {
        String powerUp = "Unknown";
        player.gainPowerUp(powerUp, player);
        assertEquals(0, player.getScore(),0.1f);
    }

    @Test
    public void testGainPowerUpForHealth() {
        String powerUp = "Health";
        player.gainPowerUp(powerUp, player);
        assertEquals(115, player.getHealth(), 0.1f);
    }
}


