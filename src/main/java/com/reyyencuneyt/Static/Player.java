package com.reyyencuneyt.Static;

public class Player {
    public String name;
    public int id;
    //static: nesne üretmeden hafızadan yer kaplar
    // static degişken tarafında ulaşılmak istenmeyen direk sınıf tarafında ulaşmak isteyen bir tipe aittir
    public static String game="cs";
    public static  int count=0;
    public Player(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void Login(){
        count++;
    }
}
