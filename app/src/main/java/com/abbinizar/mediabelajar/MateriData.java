package com.abbinizar.mediabelajar;

import java.util.ArrayList;

public class MateriData {
    public static String[][] data = new String[][]{
            {"materi satu", "describe materi satu"},
            {"materi dua", "describe materi dua"}
    };
    public static ArrayList<Materi> getListData(){
        Materi materi = null;
        ArrayList<Materi> list = new ArrayList<>();
        for (String[] aData : data){
            materi = new Materi();
            materi.setName(aData[0]);
            materi.setRemaarks(aData[1]);
            list.add(materi);
        }
        return list;
    }
}
