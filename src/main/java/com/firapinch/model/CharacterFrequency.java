package com.firapinch.model;

public class CharacterFrequency {
    private char character;
    private int frequency;

    public CharacterFrequency(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    public char getCharacter() {
        return character;
    }

    public int getFrequency() {
        return frequency;
    }
}
