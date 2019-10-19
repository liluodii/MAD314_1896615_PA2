package com.example.mad314_1896615_pa2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder>{

    private LayoutInflater mInflater;
    private List<student> mData = new ArrayList<>();

    public StudentAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData.addAll(StudentDataSource.getInstance().getAnimals());

    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_main2, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        // get the animals
        List<student> std =StudentDataSource.getInstance().getAnimals();

        // set attributes to the item
        holder.tvid.setText(String.valueOf(std.get(position).id));
        holder.tvname.setText(std.get(position).name);

    }

    @Override
        public int getItemCount() {
            return
                    StudentDataSource.getInstance().getAnimals().size();
    }

    public void update() {
        mData.clear();
        mData.addAll(StudentDataSource.getInstance().getAnimals());
        notifyDataSetChanged();
    }




}
