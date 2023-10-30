package com.example.myfitnesspal_ris_backend.controller;

import com.example.myfitnesspal_ris_backend.model.Ingredient;
import com.example.myfitnesspal_ris_backend.model.Recipe;
import com.example.myfitnesspal_ris_backend.model.RecipeIngredients;
import com.example.myfitnesspal_ris_backend.model.User;
import com.example.myfitnesspal_ris_backend.services.IngredientService;
import com.example.myfitnesspal_ris_backend.services.RecipeIngredientsService;
import com.example.myfitnesspal_ris_backend.services.RecipeService;
import com.example.myfitnesspal_ris_backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Controller {

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private RecipeIngredientsService recipeIngredientsService;

    @Autowired
    private UserService userService;

    @PostMapping("/ingredients")
    public Ingredient postIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.createIngredient(ingredient);
    }

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients(){
        return ingredientService.readIngredients();
    }

    @PutMapping("/ingredients")
    public Ingredient updateIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.updateIngredient(ingredient);
    }

    @DeleteMapping("/ingredients/{ingredientId}")
    public void deleteIngredient(@PathVariable long ingredientId){
        ingredientService.deleteIngredient(ingredientId);
    }

    @PostMapping("/recipes")
    public Recipe postRecipe(@RequestBody Recipe recipe){
        return recipeService.createRecipe(recipe);
    }

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.readRecipes();
    }

    @PutMapping("/recipes")
    public Recipe updateRecipe(@RequestBody Recipe recipe){
        return recipeService.updateRecipe(recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable long recipeId){
        recipeService.deleteRecipe(recipeId);
    }

    @PostMapping("/recipeIngredients")
    public RecipeIngredients postRecipeIngredients(@RequestBody RecipeIngredients recipeIngredients){
        return recipeIngredientsService.createRecipeIngredient(recipeIngredients);
    }

    @GetMapping("/recipeIngredients")
    public List<RecipeIngredients> getAllRecipeIngredients(){
        return recipeIngredientsService.readRecipeIngredients();
    }

    @PutMapping("/recipeIngredients")
    public RecipeIngredients updateRecipeIngredient(@RequestBody RecipeIngredients recipeIngredients){
        return recipeIngredientsService.updateRecipeIngredients(recipeIngredients);
    }

    @DeleteMapping("/recipeIngredients/{recipeIngredientId}")
    public void deleteRecipeIngredients(@PathVariable long recipeIngredientId){
        recipeIngredientsService.deleteRecipeIngredients(recipeIngredientId);
    }

    @PostMapping("/users")
    public User postUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.readUsers();
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable long userId){
        userService.deleteUser(userId);
    }

}
