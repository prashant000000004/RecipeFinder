package com.example.recipe.Listener;

import com.example.recipe.Models.RandomRecipeApiResponse;

public interface RandomRecipeListener {
    void didFetch(RandomRecipeApiResponse response,String message);
    void didError(String message);

}
