package com.training.cleancoding.ques4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void maxWater_testcase1() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int []heightBuildings = {2,0,2};
        long waterTrapped = trappingRainWater.maxWater(heightBuildings, heightBuildings.length);
        long waterThatShouldTrap = 2;
        assertEquals(waterThatShouldTrap,waterTrapped);
    }

    @Test
    void maxWater_testcase2() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int []heightBuildings = {3, 0, 2, 0, 4};
        long waterTrapped = trappingRainWater.maxWater(heightBuildings, heightBuildings.length);
        long waterThatShouldTrap = 7;
        assertEquals(waterThatShouldTrap,waterTrapped);
    }

    @Test
    void maxWater_testcase3() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int []heightBuildings = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        long waterTrapped = trappingRainWater.maxWater(heightBuildings, heightBuildings.length);
        long waterThatShouldTrap = 6;
        assertEquals(waterThatShouldTrap,waterTrapped);
    }
}
