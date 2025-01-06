package com.example.recipe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.Models.Step;
import com.example.recipe.R;

import java.util.List;

public class InstructionStepAdapter extends RecyclerView.Adapter<InstructionStepViewHolder>{
    Context context;
    List<Step> list;

    public InstructionStepAdapter(Context context, List<Step> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionStepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionStepViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instruction_steps,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionStepViewHolder holder, int position) {
        holder.textView_instruction_stepnumber.setText(String.valueOf(list.get(position).number));
        holder.textView_instruction_steptitle.setText(list.get(position).step);

        holder.recyclerView_instruction_ingredients.setHasFixedSize(true);
        holder.recyclerView_instruction_ingredients.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        InstructionIngredientAdapter instructionIngredientAdapter=new InstructionIngredientAdapter(context,list.get(position).ingredients);
        holder.recyclerView_instruction_ingredients.setAdapter(instructionIngredientAdapter);


        holder.recyclerView_instruction_equipments.setHasFixedSize(true);
        holder.recyclerView_instruction_equipments.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        InstructionEquipmentAdapter instructionEquipmentAdapter=new InstructionEquipmentAdapter(context,list.get(position).equipment);
        holder.recyclerView_instruction_equipments.setAdapter(instructionEquipmentAdapter);





    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstructionStepViewHolder extends RecyclerView.ViewHolder{
    TextView textView_instruction_stepnumber,textView_instruction_steptitle;
    RecyclerView recyclerView_instruction_equipments,recyclerView_instruction_ingredients;

    public InstructionStepViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_instruction_stepnumber=itemView.findViewById(R.id.textview_instruction_stepnumber);
        textView_instruction_steptitle=itemView.findViewById(R.id.textview_instruction_stepTitle);
        recyclerView_instruction_equipments=itemView.findViewById(R.id.recycler_instruction_equipments);
        recyclerView_instruction_ingredients=itemView.findViewById(R.id.recycler_instruction_ingredients);
    }
}
