package com.example.atvdatab2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TextViewModel extends ViewModel {
    private MutableLiveData<String> Texto;

    public MutableLiveData<String> getTexto() {
        if(Texto==null){
            Texto = new MutableLiveData<String>("Primeiro Texto");
        }
        return Texto;
    }
}
