package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private List<String> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredients(String s1, String... ingredientsArray) {
        Recipe recipe = new Recipe("pöri");
        ingredients.add(s1);
        ingredients.addAll(Arrays.asList(ingredientsArray));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}


