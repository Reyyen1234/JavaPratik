package com.reyyencuneyt.Interface;

public class Mongo implements IDatabase{
    @Override
    public void add() {
        System.out.println("mongo ekleme");
    }

    @Override
    public void delete() {
        System.out.println("mongo delete");
    }

    @Override
    public void get() {
        System.out.println("mongo elde etme");
    }

    @Override
    public void update() {
        System.out.println("mongo guncelle");
    }
}
