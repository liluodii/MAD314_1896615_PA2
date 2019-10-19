package com.example.mad314_1896615_pa2;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class StudentViewHolder extends RecyclerView.ViewHolder {

    public TextView tvid, tvname;

    public StudentViewHolder(View itemView) {
        super(itemView);
        tvid = itemView.findViewById(R.id.tvid);
        tvname = itemView.findViewById(R.id.tvname);


    }


}
