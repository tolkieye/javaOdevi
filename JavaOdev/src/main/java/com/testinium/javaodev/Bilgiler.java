package com.testinium.javaodev;

import com.testinium.javaodev.musteri.BireyselMusteri;
import com.testinium.javaodev.musteri.KurumsalMusteri;
import com.testinium.javaodev.musteri.Musteri;

import java.util.HashMap;

public class Bilgiler {

    private HashMap<Integer, Musteri> bilgiler= new HashMap<Integer, Musteri>();

    public Bilgiler() {
        bilgiler.put(1, new BireyselMusteri("12345678910", "Ali Kerem Muti", 999999, "x sokak"));
        bilgiler.put(2, new KurumsalMusteri("31231293127", "Arif Işık", 60000, "her türlü halı kilim"));
        bilgiler.put(3, new KurumsalMusteri("37821387129", "Tanrıverdi", 1000, "rockBar"));
        bilgiler.put(4, new BireyselMusteri("36123761921", "Burhan Altıntop", 100, "y sokak"));
        bilgiler.put(5, new BireyselMusteri("30912830217", "Sacit Kral", 200, "z sokak"));
    }

    public HashMap<Integer, Musteri> getBilgiler() {
        return bilgiler;
    }

    public void setBilgiler(HashMap<Integer, Musteri> bilgiler) {
        this.bilgiler = bilgiler;
    }
}
