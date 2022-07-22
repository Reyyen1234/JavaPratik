package com.reyyencuneyt.polymorphism;

public class polymorphism {
    public static void main(String[] args) {
      hayvan h=new hayvan();
      h.ses();
      kedi k=new kedi();
      k.ses();
      kopek kop=new kopek();
      kop.ses();
      heses hs=new heses();// polymerphism gorevi tam burada
      hs.hesesi(kop);
    }
}
