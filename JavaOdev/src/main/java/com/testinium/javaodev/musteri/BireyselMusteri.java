package com.testinium.javaodev.musteri;

public class BireyselMusteri extends Musteri implements ParaCekYatir{

    private String evAdresi;

    public BireyselMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
    }

    public BireyselMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public void musteriBilgileri(){
        super.musteriBilgileri();
        System.out.println("Ev Adresi: " + this.evAdresi);
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public void paraCek(int miktar1) {
        if(this.hesapBakiyesi > miktar1){
            this.hesapBakiyesi -= miktar1;
        }
        else {
            System.out.println("Yetersiz Bakiye");
        }
    }

    @Override
    public void paraYatir(int miktar2) {
        this.hesapBakiyesi += miktar2;
    }
}
