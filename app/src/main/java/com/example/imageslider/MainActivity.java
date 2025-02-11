package com.example.imageslider;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ImageSlider image_slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        image_slider=findViewById(R.id.image_slider);
        ArrayList<SlideModel> list = new ArrayList<>();
        list.add(new SlideModel( R.drawable.images, ScaleTypes.valueOf("The animal population decreased by 58 percent in 42 years.")));
        list.add(new SlideModel(R.drawable.food, ScaleTypes.valueOf("Elephants and tigers may become extinct.")));
        list.add(new SlideModel(R.drawable.ic_launcher_background, ScaleTypes.valueOf("And people do that.")));

        image_slider.setImageList(list);

    }
}