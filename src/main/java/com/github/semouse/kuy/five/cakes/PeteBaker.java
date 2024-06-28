package com.github.semouse.kuy.five.cakes;


import java.util.Map;

/**
 * Pete likes to bake some cakes. He has some recipes and ingredients.
 * Unfortunately he is not good in maths.
 * Can you help him find out, how many cakes he could bake considering his recipes?
 * <p>
 * Write a function cakes(), which takes the recipe (object)
 * and the available ingredients (also an object)
 * and returns the maximum number of cakes Pete can bake (integer).
 * For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200).
 * Ingredients that are not present in the objects, can be considered as 0.
 */
public class PeteBaker {

    public int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int cakes = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> ingredient : recipe.entrySet()) {
            Integer amount = available.getOrDefault(ingredient.getKey(), 0);
            int count = amount / ingredient.getValue();
            cakes = Math.min(cakes, count);
        }
        return cakes;
    }
}
