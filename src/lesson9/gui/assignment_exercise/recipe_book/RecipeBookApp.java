package lesson9.gui.assignment_exercise.recipe_book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeBookApp extends JFrame {
    private List<Recipe> recipes; // store list of Recipe objects
    private JTextArea recipeTextArea; // to display recipe information
    private JTextField searchField; // user input to search for recipes

    public RecipeBookApp() {
        super("Recipe Book"); // call constructor of superclass with title Recipe Book
        recipes = new ArrayList<>(); // initialize recipes as new ArrayList

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        recipeTextArea = new JTextArea(10, 30); // 10 rows and 30 columns to display recipes

        JScrollPane scrollPane = new JScrollPane(recipeTextArea); // add scroll bar

        JPanel buttonPanel = new JPanel(new FlowLayout()); // for button and search field
        JButton addButton = new JButton("Add Recipe");
        JButton editButton = new JButton("Edit Recipe");
        JButton deleteButton = new JButton("Delete Recipe");

        searchField = new JTextField(20); // for entering search items
        JButton searchButton = new JButton("Search");

        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(new JLabel("Search by Name or Ingredient:"));
        buttonPanel.add(searchField);
        buttonPanel.add(searchButton);

        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String recipeName = JOptionPane.showInputDialog("Enter recipe name:"); // user enter recipe name
                if (recipeName != null && !recipeName.isEmpty()) { // check if input is not null and not empty
                    List<String> ingredients = new ArrayList<>(); // store ingredient of recipe in ArrayList
                    String ingredient; // store each ingredient enter by user
                    do { // prompt user to enter ingredient until enter a blank ingredient
                        ingredient = JOptionPane.showInputDialog("Enter ingredient (leave blank to finish):"); // user enter ingredient
                        if (ingredient != null && !ingredient.isEmpty()) { // check if input not null and not empty
                            ingredients.add(ingredient); // add to ingredients list
                        }
                    } while (ingredient != null && !ingredient.isEmpty()); // cancel input dialog

                    if (!ingredients.isEmpty()) { // check if list ingredient not empty
                        // create new Recipe object
                        // with recipe name and comma-separated string of ingredients
                        Recipe recipe = new Recipe(recipeName, String.join(", ", ingredients));
                        recipes.add(recipe); // add new recipe to list
                        updateRecipeList(); // call method to update display of recipe
                    }
                }
            }
        });

        // getCaretPosition() - return position of text insertion caret for text component

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = recipeTextArea.getCaretPosition(); // get index of caret position, which indicate location of text cursor
                if (index != -1) { // if index is -1, no text selected
                    String editedName = JOptionPane.showInputDialog("Enter edited recipe name:"); // user enter edited recipe name
                    if (editedName != null && !editedName.isEmpty()) { // check if input non-empty name
                        String editedIngredients = JOptionPane.showInputDialog("Enter edited recipe ingredients:"); // user enter edited ingredient
                        Recipe editedRecipe = new Recipe(editedName, editedIngredients); // new Recipe object with edited name and ingredient
                        recipes.set(index, editedRecipe); // update recipe at specified index with edited recipe
                        updateRecipeList(); // call method to update display of recipe
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = recipeTextArea.getCaretPosition(); // get current caret position (cursor position), which index of recipe to be deleted
                if (index != -1 && index < recipes.size()) { // check if index is valid (not -1) within bounds of recipes list
                    recipes.remove(index); // remove recipe at specified index from list
                    updateRecipeList();// call method to update display of recipe
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText().toLowerCase(); // get text entered in searchField, convert to lowercase for case-insensitive searching
                // use stream API to filter recipes list based on searchTerm
                // create new list searchResults containing recipes which name or ingredient contains the searchTerm
                List<Recipe> searchResults = recipes.stream()
                        .filter(recipe -> recipe.getName().toLowerCase().contains(searchTerm) ||
                                recipe.getIngredients().toLowerCase().contains(searchTerm))
                        .collect(Collectors.toList()); // collect filtered recipes into a list
                displaySearchResults(searchResults); // call method to display search result
            }
        });
    }

    private void updateRecipeList() {
        StringBuilder sb = new StringBuilder(); // build a string by initialize StringBuilder
        for (Recipe recipe : recipes) { // repeat over each Recipe object in recipes list
            sb.append(recipe.getName()).append("\n") // add name of recipe followed by \n
                    .append(recipe.getIngredients()).append("\n\n"); // add ingredient of recipe followed by \n\n
        }
        recipeTextArea.setText(sb.toString()); // set text recipeTextArea to content of StringBuilder, update displayed recipes
    }

    private void displaySearchResults(List<Recipe> searchResults) {
        StringBuilder sb = new StringBuilder(); // build a string by initialize StringBuilder
        if (searchResults.isEmpty()) { // if list empty
            sb.append("No recipes found."); // append message that no recipes were found
        } else {
            for (Recipe recipe : searchResults) { // if there search result, repeat over each Recipe in searchResults list
                sb.append(recipe.getName()).append("\n") // add name of recipe followed by \n
                        .append(recipe.getIngredients()).append("\n\n"); // add ingredient of recipe followed by \n\n
            }
        }
        recipeTextArea.setText(sb.toString()); // set text recipeTextArea to content of StringBuilder, display search result or message
    }

    public static void main(String[] args) {
        new RecipeBookApp();
    }
}
