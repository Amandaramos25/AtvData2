package com.example.atvdatab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.atvdatab2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding tela = DataBindingUtil.setContentView(this, R.layout.activity_main);
        tela.setLifecycleOwner(this);

        TextViewModel lk = new ViewModelProvider(this).get(TextViewModel.class);
        tela.setVm(lk);
    }
}