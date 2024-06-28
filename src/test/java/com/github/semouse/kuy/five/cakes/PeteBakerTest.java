package com.github.semouse.kuy.five.cakes;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PeteBakerTest {

    private final PeteBaker pete = new PeteBaker();

    @Test
    void basicTest() {
        Map<String, Integer> recipe = Map.of("flour", 500, "sugar", 200, "eggs", 1);
        Map<String, Integer> available = Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200);
        assertEquals(2, pete.cakes(recipe, available));
    }

    @Test
    void missingIngredient() {
        Map<String, Integer> recipe = Map.of("flour", 500, "sugar", 200, "eggs", 1, "cinnamon", 300);
        Map<String, Integer> available = Map.of("flour", 1200, "sugar", 1200, "eggs", 5, "milk", 200);
        assertEquals(0, pete.cakes(recipe, available));
    }
}