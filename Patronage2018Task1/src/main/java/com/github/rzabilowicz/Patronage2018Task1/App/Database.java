package com.github.rzabilowicz.Patronage2018Task1.App;

import java.util.ArrayList;

public class Database<Data> {

    // OPERACJE NA BAZIE DANYCH (UTWORZENIE BAZY W PLIKU Patronage2018Tak1Application)

    ArrayList<Data> list = new ArrayList<>();

    public boolean checkList(int id){
        if(id<0 || id >= list.size())return false;
        else return true;
    }

    public void add(Data element){
        list.add(element);
    }

    public void remove(Data element){
        list.remove(element);
    }

    public  void remove(int element){
        list.remove(element);
    }

    public void size(){
        list.size();
    }
/*
    public void get(int element){
        list.get(element);
    }
    */
    public Integer get(Integer element){
        return list.indexOf(element);
    }

    public ArrayList<Data> getAll() {
        return list;
    }

    public void update(int index, Data element) {

        list.add(index, element);
    }

}
