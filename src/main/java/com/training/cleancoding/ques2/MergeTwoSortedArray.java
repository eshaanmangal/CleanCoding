package com.training.cleancoding.ques2;

import java.util.TreeMap;

public class MergeTwoSortedArray {

    private int pointerOnFinalArray = 0;
    public int [] mergingArrays(int []firstSortedArray, int []secondSortedArray){

        int []finalMergedSortedArray;
        finalMergedSortedArray = new int[firstSortedArray.length + secondSortedArray.length];

        int pointerOnFirstArray = 0;
        int pointerOnSecondArray = 0;

        while ( pointerOnFirstArray < firstSortedArray.length &&  pointerOnSecondArray < secondSortedArray.length)
        {
            /*
             Check if current element of first
             array is smaller than current element
             of second array. If yes, store first
             array element and increment first array
             index. Otherwise do same with second array
            */

            if (firstSortedArray[pointerOnFirstArray] < secondSortedArray[pointerOnSecondArray])
                finalMergedSortedArray[pointerOnFinalArray++] = firstSortedArray[pointerOnFirstArray++];
            else
                finalMergedSortedArray[pointerOnFinalArray++] = secondSortedArray[pointerOnSecondArray++];
        }

        // Store remaining elements of first array
        while (pointerOnFirstArray < firstSortedArray.length)
            finalMergedSortedArray[pointerOnFinalArray++] = firstSortedArray[pointerOnFirstArray++];

        // Store remaining elements of second array
        while (pointerOnSecondArray < secondSortedArray.length)
            finalMergedSortedArray[pointerOnFinalArray++] = secondSortedArray[pointerOnSecondArray++];

        return finalMergedSortedArray;
    }
}
