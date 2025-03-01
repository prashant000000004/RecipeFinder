package com.example.recipe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.Models.InstructionResponse;
import com.example.recipe.R;

import java.util.List;

public class InstructionAdapter extends  RecyclerView.Adapter<InstructionViewHolder>{
    Context context;
    List<InstructionResponse> list;
    private int position;

    public InstructionAdapter(Context context, List<InstructionResponse> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionViewHolder holder, int position) {
        holder.textview_instruction_name.setText(list.get(position).name);
       holder.recycler_instruction_steps.setHasFixedSize(true);

       holder.recycler_instruction_steps.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
       InstructionStepAdapter stepAdapter=new InstructionStepAdapter(context,list.get(position).steps);
       holder.recycler_instruction_steps.setAdapter(stepAdapter);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstructionViewHolder extends RecyclerView.ViewHolder{
    TextView textview_instruction_name;
    RecyclerView recycler_instruction_steps;

    public InstructionViewHolder(@NonNull View itemView) {
        super(itemView);
        textview_instruction_name=itemView.findViewById(R.id.textview_instruction_name);
        recycler_instruction_steps=itemView.findViewById(R.id.recycler_instruction_steps);
    }
}
