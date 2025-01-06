package com.example.recipe.Listener;

import com.example.recipe.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipeListener {
    void didFetch(List<SimilarRecipeResponse> response,String message);
    void didError(String message);
}
