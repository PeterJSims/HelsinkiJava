
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recipes recipes = new Recipes();

        System.out.println("File to read:");
        String fileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNext()) {
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);
                while (fileReader.hasNext()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
                recipes.addRecipe(recipe);
            }

        } catch (Exception e) {
            System.err.println("Error :" + e.getMessage());
        }

        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("find name")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes.getRecipes()) {
                    if (recipe.getName().contains(name)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println();
            }

            if (command.equals("list")) {
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes.getRecipes()) {
                    System.out.println(recipe);
                }
                System.out.println();
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes.getRecipes()) {
                    if (recipe.getCookingTime() <= cookingTime) {
                        System.out.println(recipe);
                    }
                }
                System.out.println();
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes.getRecipes()) {
                    if (recipe.containsIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println();
            }

        }

    }
}
