package FoodMaker.app.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import FoodMaker.app.Models.Step;
import FoodMaker.app.R;

public class InstructionsStepAdapter extends RecyclerView.Adapter<InstructionsStepViewHolder> {
    Context context;
    List<Step> list;

    public InstructionsStepAdapter(Context context, List<Step> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionsStepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionsStepViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions_steps, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull InstructionsStepViewHolder holder, int position) {

        holder.textView_instructions_step_number.setText(String.valueOf(list.get(position).number));
        holder.textView_instructions_step_title.setText(list.get(position).step);

        holder.recycler_instructions_ingredients.setHasFixedSize(true);
        holder.recycler_instructions_ingredients.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        InstructionsIngredientsAdapter InstructionsIngredientsAdapter = new InstructionsIngredientsAdapter(context, list.get(position).ingredients);
        holder.recycler_instructions_ingredients.setAdapter(InstructionsIngredientsAdapter);

        holder.recycler_instructions_equipments.setHasFixedSize(true);
        holder.recycler_instructions_equipments.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        InstructionsEquipmentsAdapter InstructionsEquipmentsAdapter= new InstructionsEquipmentsAdapter(context, list.get(position).equipment);
        holder.recycler_instructions_equipments.setAdapter(InstructionsEquipmentsAdapter);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class InstructionsStepViewHolder extends RecyclerView.ViewHolder{
    TextView textView_instructions_step_number,textView_instructions_step_title;
    RecyclerView recycler_instructions_equipments, recycler_instructions_ingredients;

    public InstructionsStepViewHolder(@NonNull View itemView) {
        super(itemView);


        textView_instructions_step_number = itemView.findViewById(R.id.textView_instructions_step_number);
        textView_instructions_step_title = itemView.findViewById(R.id.textView_instructions_step_title);
        recycler_instructions_equipments = itemView.findViewById(R.id.recycler_instructions_equipments);
        recycler_instructions_ingredients = itemView.findViewById(R.id.recycler_instructions_ingredients);

    }
}
