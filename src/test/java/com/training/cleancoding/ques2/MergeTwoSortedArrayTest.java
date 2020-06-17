package com.training.cleancoding.ques2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArrayTest {

    @Test
    void mergingArrays() {
        MergeTwoSortedArray merging = new MergeTwoSortedArray();
        int []firstSortedArray = {1, 3, 5, 7};
        int []secondSortedArray = {2, 4, 6, 8};
        int []expectedSortedArray = {1, 2, 3, 4,  5, 6, 7,8};
        final int[] mergedArray = merging.mergingArrays(firstSortedArray, secondSortedArray);
        assertArrayEquals(expectedSortedArray,mergedArray);
    }
}