package com.training.cleancoding.ques1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumOfSubArrayTest {

    @Test
    void calculateMaximumSumOfSubArray_TestCase1() {
        MaximumSumOfSubArray maximumSumOfSubArray = new MaximumSumOfSubArray();
        int []inputArray = {-2, -3, 4, -1, -2, 1, 5, -3};
        final int answer = maximumSumOfSubArray.calculateMaximumSumOfSubArray(inputArray, inputArray.length);
        assertEquals(7,answer);
    }

    @Test
    void calculateMaximumSumOfSubArray_TestCase2() {
        MaximumSumOfSubArray maximumSumOfSubArray = new MaximumSumOfSubArray();
        int []inputArray = {-2, -3, 4, -1, 2, 5, -3};
        final int answer = maximumSumOfSubArray.calculateMaximumSumOfSubArray(inputArray, inputArray.length);
        assertEquals(70,answer);
    }

    @Test
    void calculateMaximumSumOfSubArray_TestCase3() {
        MaximumSumOfSubArray maximumSumOfSubArray = new MaximumSumOfSubArray();
        int []inputArray = {-1, -2, 1, 5, -3};
        final int answer = maximumSumOfSubArray.calculateMaximumSumOfSubArray(inputArray, inputArray.length);
        assertEquals(6,answer);
    }
}