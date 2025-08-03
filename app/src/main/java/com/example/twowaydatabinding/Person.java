package com.example.twowaydatabinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {

    private String Name;
    private String Email;


    public Person(String name, String email) {
        Name = name;
        Email = email;
    }

    @Bindable
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
        notifyPropertyChanged(BR.email);
    }
}
