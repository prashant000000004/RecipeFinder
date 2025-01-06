package com.example.recipe.Listener;

import com.example.recipe.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response,String message);
    void didError(String message);

}
