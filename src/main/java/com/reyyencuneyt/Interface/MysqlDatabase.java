package com.reyyencuneyt.Interface;

public class MysqlDatabase implements IDatabase{
    @Override
    public void add() {
        System.out.println("mysql ekleme");
    }

    @Override
    public void delete() {
        System.out.println("mysql delete");
    }

    @Override
    public void get() {
        System.out.println("mysql elde etme");
    }

    @Override
    public void update() {
        System.out.println("mysql guncelle");
    }
}
