package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
private TextView name;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.textview);
    }

    public void bind(String s) {
        name.setText(s);
    }
}
