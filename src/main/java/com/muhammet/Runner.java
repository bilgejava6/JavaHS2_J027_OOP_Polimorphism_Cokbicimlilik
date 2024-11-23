package com.muhammet;

import com.muhammet.entity.BuyukbasBakicisi;
import com.muhammet.entity.KucukbasBakicisi;
import com.muhammet.entity.KumesHayvanlariBakicisi;
import com.muhammet.entity.TorpakAgasi;

public class Runner {
    public static void main(String[] args) {
        /**
         * Toprak Ağası,
         * - Küçükbaş
         * - Büyükbaş
         * - Kümes
         * miras veren sınıf ya da interface miras alan sınıfın referansını taşıyabilir.
         * yani kendi özellikleri ile o sınıfa ait methodlara erişebilir ve çağırabilir.
         */
//        KumesHayvanlariBakicisi kumesHayvanlariBakicisi = new KumesHayvanlariBakicisi();
//        BuyukbasBakicisi buyukbasBakicisi = new BuyukbasBakicisi();
//        KucukbasBakicisi kucukbasBakicisi = new KucukbasBakicisi();
//        kucukbasBakicisi.Besle("17:00");
//        buyukbasBakicisi.Besle("17:00");
//        kumesHayvanlariBakicisi.Besle("10:00");
        TorpakAgasi aga = new BuyukbasBakicisi();
        aga.Besle("19:00");
        aga = new KucukbasBakicisi();
        aga.Besle("19:00");
        aga = new KumesHayvanlariBakicisi();
        aga.Besle("19:00");
    }
}