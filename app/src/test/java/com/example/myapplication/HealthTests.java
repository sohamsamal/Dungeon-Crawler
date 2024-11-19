package com.example.myapplication;
import org.junit.Test;
import static org.junit.Assert.*;

import com.example.myapplication.model.HealthManager;
import com.example.myapplication.model.Obstacle;
import com.example.myapplication.viewmodel.PlayerViewModel;
import com.example.myapplication.model.DefaultMovement;
import com.example.myapplication.model.SlowMovement;

public class HealthTests {

    @Test
    public void healthBoost() {
        double initialHealth = 5;
        HealthManager healthManager = new HealthManager(initialHealth);
        int boost = 5;
        healthManager.incrementHealth(boost);

        assertEquals(10, healthManager.getHealth());
    }

    @Test
    public void healthReduction() {
        double initialHealth = 5;
        HealthManager healthManager = new HealthManager(initialHealth);
        int attack = 5;
        healthManager.decrementHealth(attack);

        assertEquals(0, healthManager.getHealth());
    }
}
