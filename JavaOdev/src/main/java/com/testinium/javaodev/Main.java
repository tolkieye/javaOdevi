package com.testinium.javaodev;

import com.testinium.javaodev.musteri.BireyselMusteri;
import com.testinium.javaodev.musteri.KurumsalMusteri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**************");
        int miktar,islem;
        Scanner scanner = new Scanner(System.in);
        Bilgiler bilgiler1 = new Bilgiler();

        System.out.println("Müşteri Numaranızı Giriniz: ");
        Integer musteriNo = scanner.nextInt();
        System.out.println("Merhaba " +bilgiler1.getBilgiler().get(musteriNo).getAdSoyad());
        System.out.println("Hesap Bilgileriniz: ");
        if (bilgiler1.getBilgiler().get(musteriNo) instanceof BireyselMusteri){
            ((BireyselMusteri) bilgiler1.getBilgiler().get(musteriNo)).musteriBilgileri();
            System.out.println("Yapmak istediğiniz işlemi tuşlayınız: ");
            System.out.println("1- Para Yatırma");
            System.out.println("2- Para Çekme");
            islem = scanner.nextInt();
            if (islem == 1) {
                System.out.println("Yatırmak istediğiniz miktarı girin: ");
                miktar = scanner.nextInt();
                ((BireyselMusteri) bilgiler1.getBilgiler().get(musteriNo)).paraYatir(miktar);
                System.out.println("Yeni Bakiye: " + ((BireyselMusteri) bilgiler1.getBilgiler().get(musteriNo)).getHesapBakiyesi());
            } else if (islem == 2) {
                System.out.println("Çekmek istediğiniz miktarı girin: ");
                miktar = scanner.nextInt();
                ((BireyselMusteri) bilgiler1.getBilgiler().get(musteriNo)).paraCek(miktar);
                System.out.println("Yeni Bakiye: " + ((BireyselMusteri) bilgiler1.getBilgiler().get(musteriNo)).getHesapBakiyesi());

            } else {
                System.out.println("geçersiz işlem.");
            }

        } else {
            ((KurumsalMusteri) bilgiler1.getBilgiler().get(musteriNo)).musteriBilgileri();
            System.out.println("Yapmak istediğiniz işlemi tuşlayınız: ");
            System.out.println("1- Para Yatırma");
            System.out.println("2- Para Çekme");
            islem = scanner.nextInt();
            if (islem == 1) {
                System.out.println("Yatırmak istediğiniz miktarı girin: ");
                miktar = scanner.nextInt();
                ((KurumsalMusteri) bilgiler1.getBilgiler().get(musteriNo)).paraYatir(miktar);
                System.out.println("Yeni Bakiye: " + ((KurumsalMusteri) bilgiler1.getBilgiler().get(musteriNo)).getHesapBakiyesi());
            } else if (islem == 2) {
                System.out.println("Çekmek istediğiniz miktarı girin: ");
                miktar = scanner.nextInt();
                ((KurumsalMusteri) bilgiler1.getBilgiler().get(musteriNo)).paraCek(miktar);
                System.out.println("Yeni Bakiye: " + ((KurumsalMusteri) bilgiler1.getBilgiler().get(musteriNo)).getHesapBakiyesi());
            } else {
                System.out.println("geçersiz işlem.");
            }

        }

    }
}
