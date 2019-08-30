package com.example.teste3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListItens [] listItens = new ListItens[]{
                new ListItens("Fotografia", R.drawable.baseline_add_a_photo_black_18dp),
                new ListItens("Música", R.drawable.baseline_audiotrack_black_18dp),
                new ListItens("Pintura", R.drawable.baseline_color_lens_black_18dp),
                new ListItens("Escrita", R.drawable.baseline_edit_black_18dp),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListItensAdapter adapter = new ListItensAdapter(listItens);
        recyclerView.setAdapter(adapter);







    }
}
