package com.example.lemonstory;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public enum Stages{
        START,
        PICK,
        MAKE,
        DRINK
    }
    static Stages stage = Stages.PICK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setOnClickListener((view) -> nextStage());
    }
    public void nextStage(){
        ImageView imageView = findViewById(R.id.imageView3);
        TextView textView = findViewById(R.id.textView);
        if(stage == Stages.START){
            stage = Stages.PICK;
            textView.setText("Tap to pick the lemon");
            imageView.setImageResource(R.drawable._5190);
        }
        else if(stage == Stages.PICK){
            stage = Stages.MAKE;
            textView.setText("Tap to make a lemon juice");
            imageView.setImageResource(R.drawable.cool_lemon_character_sunglasses_cartoon_happy_smiling_thumbs_up_isolated_white_background_eps_file_available_50382699);
        }
        else if(stage == Stages.MAKE){
            textView.setText("Tap to drink a lemon juice");
            stage = Stages.DRINK;
            imageView.setImageResource(R.drawable.depositphotos_38693215_stock_illustration_glass_with_lemonade_and_lemons);
        }
        else if(stage == Stages.DRINK){
            stage = Stages.START;
            textView.setText("Tap to start again");
            imageView.setImageResource(R.drawable.pngtree_sad_cup_illustration_vector_on_white_background_png_image_2054411);
        }

    }
}