package com.training.cleancoding.ques4;


/* */
public class TrappingRainWater {
    public long maxWater(int[] arrayOfBuildingHeights, int totalNumberOfBuildings)
    {
        int []leftMostHighestBuilding;
        int []rightMostHighestBuilding;

        leftMostHighestBuilding = new int[totalNumberOfBuildings];
        rightMostHighestBuilding = new int[totalNumberOfBuildings];

        int maximumHeightLeft = Integer.MIN_VALUE;
        int maximumHeightRight = Integer.MIN_VALUE;

        for(int i=0;i<totalNumberOfBuildings;i++) {
            maximumHeightLeft = Math.max(maximumHeightLeft,arrayOfBuildingHeights[i]);
            leftMostHighestBuilding[i] = maximumHeightLeft;
        }

        for(int i=totalNumberOfBuildings-1;i>=0;i--) {
            maximumHeightRight = Math.max(maximumHeightRight,arrayOfBuildingHeights[i]);
            rightMostHighestBuilding[i] = maximumHeightRight;
        }

        long totalWaterTrapped = 0;

        for(int i=0;i<totalNumberOfBuildings;i++) {
            totalWaterTrapped += Math.min(rightMostHighestBuilding[i], leftMostHighestBuilding[i])-arrayOfBuildingHeights[i];
        }
        return totalWaterTrapped;
    }
}
