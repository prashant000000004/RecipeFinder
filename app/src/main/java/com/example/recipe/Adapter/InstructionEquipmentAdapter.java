package com.example.recipe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.Models.Equipment;
import com.example.recipe.Models.Ingredient;
import com.example.recipe.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class  InstructionEquipmentAdapter extends RecyclerView.Adapter< InstructionEquipmentViewHolder > {

    Context context;
    List<Equipment> list;

    public InstructionEquipmentAdapter(Context context, List<Equipment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public  InstructionEquipmentViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new  InstructionEquipmentViewHolder (LayoutInflater.from(context).inflate(R.layout.list_instruction_step_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionEquipmentViewHolder holder, int position) {
        holder.textView_instruction_step_item.setText(list.get(position).name);
        holder.textView_instruction_step_item.setSelected(true);
        Picasso.get().load("https://img.spoonacular.com/equipment_100x100/"+list.get(position).image).into(holder.imageView_instruction_step_items);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstructionEquipmentViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView_instruction_step_items;
    TextView textView_instruction_step_item;

    public  InstructionEquipmentViewHolder (@NonNull View itemView) {
        super(itemView);
        imageView_instruction_step_items=itemView.findViewById(R.id.imageview_instruction_step_item);
        textView_instruction_step_item=itemView.findViewById(R.id.textview_instruction_step_item);
    }
}
