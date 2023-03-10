package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DemoRecyclerViewAdapter extends RecyclerView.Adapter<DemoRecyclerViewAdapter.DemoViewHolder> {

    Context context;
    String programmingLanguages[];
    String descriptions[];
    int images[];

    public DemoRecyclerViewAdapter(Context context, String programmingLanguages[], String descriptions[], int images[]) {
        this.context = context;
        this.programmingLanguages = programmingLanguages;
        this.descriptions = descriptions;
        this.images = images;

    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.demo_row, parent, false);

        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int position) {

        holder.programmingLanguagesView.setText(programmingLanguages[position]);
        holder.descriptionsView.setText(descriptions[position]);
        holder.imagesView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return programmingLanguages.length;
    }

    public class DemoViewHolder extends RecyclerView.ViewHolder{

        TextView programmingLanguagesView;
        TextView descriptionsView;
        ImageView imagesView;

        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);

            programmingLanguagesView = itemView.findViewById(R.id.programmingLanguageText);
            descriptionsView = itemView.findViewById(R.id.descriptionText);
            imagesView = itemView.findViewById(R.id.imageView);
        }
    }
}
