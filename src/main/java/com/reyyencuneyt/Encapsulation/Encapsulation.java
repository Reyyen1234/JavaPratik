package com.reyyencuneyt.Encapsulation;
//ornek: bir kisi metoru surme ihliyatti var, metoru nasil kullanildigini biliyor ama metorun icindeki benzin gibi nasil yaktigini bilemsini gerek yok

public class Encapsulation {
   private String name;
   private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
