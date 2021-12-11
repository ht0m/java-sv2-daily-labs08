package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testRecipeConstructorWithOneParameter() {
        Recipe recipe = new Recipe("pincepörkölt");
        assertEquals("pincepörkölt", recipe.getName());
        assertEquals(null, recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testRecipeConstructorWithTwoParameter() {
        Recipe recipe2 = new Recipe("pincepörkölt", "Pörkölt borral, krumplival, lehetőleg bográcsban");
        assertEquals("pincepörkölt", recipe2.getName());
        assertEquals("Pörkölt borral, krumplival, lehetőleg bográcsban", recipe2.getDescription());
        assertEquals(0, recipe2.getIngredients().size());
    }

    @Test
    void testAddIngredients() {
        Recipe recipe3 = new Recipe("pincepörkölt", "Pörkölt borral, krumplival, lehetőleg bográcsban");
        recipe3.addIngredients("onion", "salt","meat","potato");
        assertEquals(4, recipe3.getIngredients().size());
        assertEquals("meat", recipe3.getIngredients().get(2));
    }

}