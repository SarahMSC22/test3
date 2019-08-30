package com.example.teste3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView mainText;
    private ImageView mainImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        
        ListItens packItens = (ListItens) getIntent().getBundleExtra("pacote").getSerializable("item");

        mainText = (TextView) findViewById(R.id.text_second_activity);
        mainImage = (ImageView) findViewById(R.id.img_second_activity);
        
        mainText.setText(packItens.getText());
        mainImage.setImageResource(packItens.getImgId());
        
    }
}
