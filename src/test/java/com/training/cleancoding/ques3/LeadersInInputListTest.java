package com.training.cleancoding.ques3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class LeadersInInputListTest {

    @Test
    void getLeadersInputList() {
        LeadersInInputList leadersInInputList = new LeadersInInputList();

        List<Integer> inputList = new ArrayList<>();
        inputList.add(16);
        inputList.add(17);
        inputList.add(4);
        inputList.add(3);
        inputList.add(5);
        inputList.add(2);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(5);
        expectedList.add(17);

        final List<Integer> outputList = leadersInInputList.getLeadersInputList(inputList);
        assertEquals(expectedList,outputList);

    }
}