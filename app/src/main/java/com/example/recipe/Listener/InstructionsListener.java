package com.example.recipe.Listener;

import com.example.recipe.Models.InstructionResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionResponse> response, String message);
    void didError(String message);

}
