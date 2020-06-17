package com.training.cleancoding.ques1;

public class MaximumSumOfSubArray {

    public int calculateMaximumSumOfSubArray(int []inputArray , int sizeOfInputArray){

        int maximumSumAtIndex_i = inputArray[0];
        int maxSoFar = inputArray[0];

        for (int i = 1; i < sizeOfInputArray; i++) {
            maximumSumAtIndex_i = Math.max(inputArray[i], maximumSumAtIndex_i +inputArray[i]);
            maxSoFar = Math.max(maxSoFar, maximumSumAtIndex_i);
        }
        return maxSoFar;
    }
}
