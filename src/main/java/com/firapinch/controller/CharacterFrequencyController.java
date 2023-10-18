package com.firapinch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class CharacterFrequencyController {

    @GetMapping("/calculate-frequency")
    public Map<Character, Long> calculateFrequency(@RequestParam String input) {
        if (input == null || input.isEmpty()) {
            return Map.of();
        }

        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
    }
}
