package com.firapinch.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Map;

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
        Map<Character, Integer> expectedFrequencyMap = Map.of('a', 5, 'c', 4, 'b', 1);

        // Act
        Map<Character, Long> result = controller.calculateFrequency(input);

        // Assert
        assertEquals(expectedFrequencyMap, result);
    }

    @Test
    public void testCalculateFrequencyEmptyInput() {
        // Arrange
        String input = "";
        Map<Character, Integer> expectedFrequencyMap = Map.of();

        // Act
        Map<Character, Long> result = controller.calculateFrequency(input);

        // Assert
        assertEquals(expectedFrequencyMap, result);
    }

    @Test
    public void testCalculateFrequencyNullInput() {
        // Arrange
        String input = null;
        Map<Character, Integer> expectedFrequencyMap = Map.of();

        // Act
        Map<Character, Long> result = controller.calculateFrequency(input);

        // Assert
        assertEquals(expectedFrequencyMap, result);
    }
}
