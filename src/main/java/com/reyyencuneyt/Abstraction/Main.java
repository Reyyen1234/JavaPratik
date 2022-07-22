package com.reyyencuneyt.Abstraction;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        kisi ks= new ogrenci();
        ks.show();
        ks.add();
        List<String> listem=new ArrayList<String>();
        listem.add("hatay");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("karabuk");
        List<String> yenilist= listem.stream().sorted().collect(Collectors.toList());
        System.out.println(yenilist);
    }
}
