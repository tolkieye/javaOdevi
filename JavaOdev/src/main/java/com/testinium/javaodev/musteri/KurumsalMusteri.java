package com.testinium.javaodev.musteri;

public class KurumsalMusteri extends Musteri implements ParaCekYatir {

    private String sirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
    }

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public void musteriBilgileri(){
        super.musteriBilgileri();
        System.out.println("Şirket Adı: " + this.sirketAdi);
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
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
