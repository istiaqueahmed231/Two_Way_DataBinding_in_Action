package com.example.twowaydatabinding;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.twowaydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    CustomViewModel customViewModel=new CustomViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.setViewmodel(customViewModel);
        binding.setLifecycleOwner(this);


    }
}