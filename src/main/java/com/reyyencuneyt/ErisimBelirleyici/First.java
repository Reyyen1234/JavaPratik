package com.reyyencuneyt.ErisimBelirleyici;

public class First {
    //public
   String str;
   private String ABC="hello world";
    First(String str){
        this.str=str;
    }
   /* public static void main(String[] args) {
        System.out.println("hey i am reyyen");
    }*/
    //private degisken
    public void ShowABC(){
        System.out.println(this.ABC);
    }
    //private Method
    //sadece sınıf içersinde erişebiliyorum, değir sınıflarda erişemez
    private void ShowMethod(){
        System.out.println(this.ABC);
    }
    //protected: ayni package içerisinde farklı classlarda erişim sağlayabiliyoruz, ama farklı pakagelerde erişim sağlayamaz
    //Default

           //Ayni paket farkli class                           //ayni paket ayni class
   /* public: comert  +                                                +
      protected: Araf +                                                +
      private: cimri  -                                                +
      Default:        +                                                +*/

}
