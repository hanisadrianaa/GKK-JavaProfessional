package lesson9.gui.assignment_exercise.recipe_book;

public class Recipe {
    private String name;
    private String ingredients;

    public Recipe(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }
}
