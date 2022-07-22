package com.reyyencuneyt.ErisimBelirleyici;

import com.reyyencuneyt.Static.Player;

public class Main {
    public static void main(String[] args) {
       First a=new First("hey i am reyyen");
        System.out.println(a.str);
        a.ShowABC();
        Player pl=new Player("reyyen",1);
        pl.Login();
        System.out.println(Player.count);
        System.out.println(pl.name);

        System.out.println(pl.game);


    }
}
