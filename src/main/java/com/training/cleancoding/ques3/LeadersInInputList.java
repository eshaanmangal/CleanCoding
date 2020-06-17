package com.training.cleancoding.ques3;


/* Leaders in Array means if an element
is greater than all the elements to its
right then that element is leader. */

import java.util.ArrayList;
import java.util.List;

public class LeadersInInputList {

    public List<Integer> getLeadersInputList( List <Integer> inputList)
    {
        List<Integer> leadersInInputList = new ArrayList<>();
        // Maximum element from right will be last element of the Input List
        int maximumElementFromRight =  inputList.get(inputList.size()-1);
        leadersInInputList.add(maximumElementFromRight);

        // Start from second last element now
        for (int i = inputList.size()-2; i >= 0; i--)
        {
            // Check if element is grater than largest element to its right if it is update largest element
            if (maximumElementFromRight < inputList.get(i))
            {
                maximumElementFromRight = inputList.get(i);
                leadersInInputList.add(maximumElementFromRight);
            }
        }
        return leadersInInputList;
    }
}
