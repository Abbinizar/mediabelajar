package com.abbinizar.mediabelajar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListMateriAdapter extends RecyclerView.Adapter<ListMateriAdapter.CategoryViewHolder> {
    private Context context;

    public ListMateriAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Materi> ListMateri;

    public ArrayList<Materi> getListMateri() {
        return ListMateri;
    }

    public void setListMateri(ArrayList<Materi> listMateri) {
        ListMateri = listMateri;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvMateri;
        TextView tvRemarks;
        public CategoryViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tvMateri = itemView.findViewById(R.id.tv_item_materi);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
        }
    }
}
