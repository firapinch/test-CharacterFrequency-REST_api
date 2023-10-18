package com.firapinch.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterFrequencyControllerTest {

    @InjectMocks
    private CharacterFrequencyController controller;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateFrequency() {
        // Arrange
        String input = "aaaaabcccc";
        Map<Character, Long> expectedFrequencyMap = new HashMap<>();
        expectedFrequencyMap.put('a', 5L);
        expectedFrequencyMap.put('c', 4L);
        expectedFrequencyMap.put('b', 1L);

        // Act
        Map<Character, Long> result = controller.calculateFrequency(input);

        // Assert
        assertEquals(expectedFrequencyMap, result);
    }

    @Test
    public void testCalculateFrequencyEmptyInput() {
        // Arrange
        String input = "";
        Map<Character, Long> expectedFrequencyMap = new HashMap<>();

        // Act
        Map<Character, Long> result = controller.calculateFrequency(input);

        // Assert
        assertEquals(expectedFrequencyMap, result);
    }

    @Test
    public void testCalculateFrequencyNullInput() {
        // Arrange
        String input = null;
        Map<Character, Long> expectedFrequencyMap = new HashMap<>();

        // Act
        Map<Character, Long> result = controller.calculateFrequency(input);

        // Assert
        assertEquals(expectedFrequencyMap, result);
    }
}

