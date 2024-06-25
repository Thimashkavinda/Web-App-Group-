package com.example.winestoreapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class WineAdapter extends RecyclerView.Adapter<WineAdapter.WineViewHolder> {

    private Context context;
    private List<Wine> wineList;

    public WineAdapter(Context context, List<Wine> wineList) {
        this.context = context;
        this.wineList = wineList;
    }

    @NonNull
    @Override
    public WineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_wine, parent, false);
        return new WineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WineViewHolder holder, int position) {
        Wine wine = wineList.get(position);
        holder.nameTextView.setText(wine.getName());
        holder.descriptionTextView.setText(wine.getDescription());
        holder.priceTextView.setText(String.format("$%.2f", wine.getPrice()));
        Glide.with(context).load(wine.getImageUrl()).into(holder.wineImageView);
    }

    @Override
    public int getItemCount() {
        return wineList.size();
    }

    public static class WineViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView descriptionTextView;
        TextView priceTextView;
        ImageView wineImageView;

        public WineViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            wineImageView = itemView.findViewById(R.id.wineImageView);
        }
    }
}

