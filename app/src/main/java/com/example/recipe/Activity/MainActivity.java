package com.example.recipe.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.Adapter.RandomRecipeAdapter;
import com.example.recipe.Listener.RandomRecipeListener;
import com.example.recipe.Listener.RecipeClickListener;
import com.example.recipe.Models.RandomRecipeApiResponse;
import com.example.recipe.R;
import com.example.recipe.RequestManager;
import com.example.recipe.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ActivityMainBinding binding;
    ProgressDialog dialog;
    RequestManager manager;
    RandomRecipeAdapter randomRecipeAdapter;
    RecyclerView recyclerView;
    List<String> tags=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dialog=new ProgressDialog(this);
        dialog.setTitle("Loading....");
        binding.searchviewHome.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                tags.clear();
                tags.add(query);
                manager.GetRandomRecipes(randomRecipeListener,tags);
                dialog.show();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        spinner=findViewById(R.id.spinner_tags);
        ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(
                this,
                R.array.tags,
                R.layout.spinner_text
        );

        arrayAdapter.setDropDownViewResource(R.layout.spinner_inner_text);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(spinnerSelectedListener);




        manager=new RequestManager(this);
//        manager.GetRandomRecipes(randomRecipeListener);
//        dialog.show();
    }

    private final RandomRecipeListener randomRecipeListener=new RandomRecipeListener() {
        @Override
        public void didFetch(RandomRecipeApiResponse response, String message) {
           recyclerView=findViewById(R.id.recycler_random);
           recyclerView.setHasFixedSize(true);
           recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,1));
           randomRecipeAdapter=new RandomRecipeAdapter(MainActivity.this,response.recipes,recipeClickListener);
           recyclerView.setAdapter(randomRecipeAdapter);

        }

        @Override
        public void didError(String message) {
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

        }
    };

    private final AdapterView.OnItemSelectedListener spinnerSelectedListener=new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            tags.clear();
            tags.add(adapterView.getSelectedItem().toString());
            manager.GetRandomRecipes(randomRecipeListener,tags);
            dialog.show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
    private final RecipeClickListener recipeClickListener=new RecipeClickListener() {
        @Override
        public void onRecipeClicked(String id) {
            startActivity(new Intent(MainActivity.this,RecipeDetailsActivity.class)
                    .putExtra("id",id));


        }
    };

}