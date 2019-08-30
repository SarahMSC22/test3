package com.example.teste3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ListItensAdapter extends RecyclerView.Adapter<ListItensAdapter.ViewHolder> {
    private ListItens[] listItens;

    public ListItensAdapter(ListItens[] listItens) {
        this.listItens = listItens;
    }


    @NonNull
    @Override
    public ListItensAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final ListItens listItens1 = listItens[position];
        holder.textView.setText(listItens[position].getText());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("item", listItens[position]);
                intent.putExtra("pacote", bundle);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItens.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public LinearLayout linearLayout;

        public ViewHolder(View listItem) {
            super(listItem);
            this.linearLayout = (LinearLayout) listItem.findViewById(R.id.recycler_view);
            this.textView = (TextView) listItem.findViewById(R.id.recycler_list);

        }
    }
}
