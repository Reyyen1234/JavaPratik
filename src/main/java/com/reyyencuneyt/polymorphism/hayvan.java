package com.reyyencuneyt.polymorphism;

public class hayvan {
    public void ses(){
        System.out.println("hayvanin cikarttigi ses");
    }
}
class kedi extends hayvan{
    public void ses(){
        System.out.println("miyav");
    }
}
class kopek extends kedi{
    public void ses(){
        System.out.println("hav hav");
    }
}
class heses extends hayvan{
    //parametre olarak class cagirdik
    public void  hesesi(hayvan Hayvan){
        Hayvan.ses();
    }
}