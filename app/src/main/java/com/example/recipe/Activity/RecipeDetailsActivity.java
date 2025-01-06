package com.example.recipe.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.Adapter.IngredientsAdapter;
import com.example.recipe.Adapter.InstructionAdapter;
import com.example.recipe.Adapter.InstructionStepAdapter;
import com.example.recipe.Adapter.SimilarRecipeAdapter;
import com.example.recipe.Listener.InstructionsListener;
import com.example.recipe.Listener.RecipeClickListener;
import com.example.recipe.Listener.RecipeDetailsListener;
import com.example.recipe.Listener.SimilarRecipeListener;
import com.example.recipe.Models.InstructionResponse;
import com.example.recipe.Models.RecipeDetailsResponse;
import com.example.recipe.Models.SimilarRecipeResponse;
import com.example.recipe.R;
import com.example.recipe.RequestManager;
import com.example.recipe.databinding.ActivityRecipeDetailsBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecipeDetailsActivity extends AppCompatActivity {
    ActivityRecipeDetailsBinding binding;
    int id;
    RequestManager manager;
    ProgressDialog dialog;
    IngredientsAdapter ingredientsAdapter;
    SimilarRecipeAdapter similarRecipeAdapter;
    InstructionAdapter  instructionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityRecipeDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        id= Integer.parseInt(getIntent().getStringExtra("id"));
        manager=new RequestManager(this);
        manager.getRecipeDetails(recipeDetailsListener,id);
        manager.getSimilarRecipe(similarRecipeListener,id);
        manager.getInstructions(instructionsListener,id);
        dialog=new ProgressDialog(this);
        dialog.setTitle("Loading..");
        dialog.show();


    }
    private final RecipeDetailsListener recipeDetailsListener=new RecipeDetailsListener() {
        @Override
        public void didFetch(RecipeDetailsResponse response, String message) {
            dialog.dismiss();
            binding.textviewMealName.setText(response.title);
            binding.textviewMealSource.setText(response.sourceName);
            binding.textviewMealSummary.setText(response.summary);
            Picasso.get().load(response.image).into(binding.imageViewMealImage);

            binding.recyclerMealIngredients.setHasFixedSize(true);
            binding.recyclerMealIngredients.setLayoutManager(new LinearLayoutManager(RecipeDetailsActivity.this,LinearLayoutManager.HORIZONTAL,false));
            ingredientsAdapter=new IngredientsAdapter(RecipeDetailsActivity.this,response.extendedIngredients);
            binding.recyclerMealIngredients.setAdapter(ingredientsAdapter);

        }

        @Override
        public void didError(String message) {
            Toast.makeText(RecipeDetailsActivity.this, message, Toast.LENGTH_SHORT).show();

        }
    };
    private final SimilarRecipeListener similarRecipeListener=new SimilarRecipeListener() {
        @Override
        public void didFetch(List<SimilarRecipeResponse> response, String message) {
            binding.recyclerMealSimilar.setHasFixedSize(true);
            binding.recyclerMealSimilar.setLayoutManager(new LinearLayoutManager(RecipeDetailsActivity.this,LinearLayoutManager.HORIZONTAL,false));
            similarRecipeAdapter=new SimilarRecipeAdapter(RecipeDetailsActivity.this,response,recipeClickListener);
            binding.recyclerMealSimilar.setAdapter(similarRecipeAdapter);

        }

        @Override
        public void didError(String message) {

            Toast.makeText(RecipeDetailsActivity.this, message, Toast.LENGTH_SHORT).show();
        }
    };
    private final RecipeClickListener recipeClickListener=new RecipeClickListener() {
        @Override
        public void onRecipeClicked(String id) {
            startActivity(new Intent(RecipeDetailsActivity.this,RecipeDetailsActivity.class)
                    .putExtra("id",id));

        }
    };

    private final InstructionsListener instructionsListener=new InstructionsListener() {
        @Override
        public void didFetch(List<InstructionResponse> response, String message) {
            binding.recyclerMealInstruction.setHasFixedSize(true);
            binding.recyclerMealInstruction.setLayoutManager(new LinearLayoutManager(RecipeDetailsActivity.this,LinearLayoutManager.VERTICAL,false));
            instructionAdapter=new InstructionAdapter(RecipeDetailsActivity.this,response);
            binding.recyclerMealInstruction.setAdapter(instructionAdapter);


        }

        @Override
        public void didError(String message) {

        }
    };
}