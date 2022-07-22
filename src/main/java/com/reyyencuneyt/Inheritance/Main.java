package com.reyyencuneyt.Inheritance;

import com.reyyencuneyt.Encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setName("reyyen");
        encapsulation.getName();
        System.out.println(encapsulation.getName());
        ogrenci ogrenci=new ogrenci();
        ogrenci.id=10; // ogrenci kisiden inheritance, extende yaparak kisi tum attributleri alip kullanabildi
       //ayni sinif ozellikleri her seferinde yazmak yerine bir class olusturup extend yapip ayni sonucu elde edebiliyoruz
    }

    }

