package com.firapinch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class CharacterFrequencyController {

    @GetMapping("/calculate-frequency")
    public Map<Character, Integer> calculateFrequency(@RequestParam String input) {
        if (input == null || input.isEmpty()) {
            return Map.of();
        }

        Map<Character, Integer> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        character -> character,
                        character -> 1,
                        Integer::sum
                ));

        return frequencyMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}



