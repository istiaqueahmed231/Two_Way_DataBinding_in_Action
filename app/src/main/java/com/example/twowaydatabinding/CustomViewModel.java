package com.example.twowaydatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomViewModel extends ViewModel {

    public MutableLiveData<String> personName=new MutableLiveData<>("");
    public MutableLiveData<String> personEmail=new MutableLiveData<>("");

}
