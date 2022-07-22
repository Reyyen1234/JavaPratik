package com.reyyencuneyt.Abstraction;

public class ogrenci extends kisi{
    //method abstract oldugu icin @override yapmamizi istedi
    private String ogrNo;
    private String sube;
    @Override
    public void show() {
        System.out.println("eklendi");
    }
}
