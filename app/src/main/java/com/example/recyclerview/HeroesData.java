package com.example.recyclerview;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Iron Man", "Iron Man (Anthony Edward 'Tony' Stark) adalah pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh Marvel Comics, serta media yang terkait. Karakter diciptakan oleh penulis dan editor Stan Lee, yang dikembangkan oleh penulis skenario Larry Lieber, dan dirancang oleh seniman Don Heck dan Jack Kirby. Dia membuat penampilan pertamanya di Tales of Suspense #39 (cover tertanggal bulan Maret 1963).", "https://upload.wikimedia.org/wikipedia/id/e/e0/Iron_Man_bleeding_edge.jpg"},
            {"Captain America", "Captain America adalah sosok pahlawan super fiktif dari Marvel Comics. Memiliki musuh besar bernama Red Skull dan Baron Zemo, Rogers adalah tentara AS yang tidak memiliki kemampuan sama sekali. Berkat bantuan Dr. Joshef Reinstein dengan serum super soldiernya. Pahlawan yg lahir pada tahun 1920 ini menjadi pahlawan perang Amerika Serikat saat menghadapi sekutu NAZI yang dipimpin oleh Adolf Hitler. Dibuat oleh komikus Joe Simon dan Jack Kirby, karakter pertama kali muncul di Captain America Comics # 1 (cover Maret 1941) dari Timely Comics, pendahulu dari Marvel Comics.", "https://upload.wikimedia.org/wikipedia/id/9/91/CaptainAmerica109.jpg"},
            {"Spider Man", "Spider-Man, adalah pahlawan super fiktif dari Marvel Comics yang diciptakan oleh penulis Stan Lee dan artis Steve Ditko. Ia pertama muncul dalam Amazing Fantasy #15 (Agustus 1962). Ia telah menjadi salah satu pahlawan super yang paling terkenal di dunia.", "https://upload.wikimedia.org/wikipedia/id/7/74/Spider-Man547.jpg"},
            {"Hulk", "Hulk, adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics. DIciptakan oleh Stan Lee dan Jack Kirby, tokoh ini pertama kali muncul di The Incredible Hulk #1 (Mei 1962). Pada tahun 2008, majalah Wizard memberikan julukan kepada Hulk sebagai tokoh dari ketujuh Marvel Comics terhebat Empire Magazine menamakannya sebagai keempat belas tokoh komik dan rangking lima terbesar dari Marvel.", "https://upload.wikimedia.org/wikipedia/id/b/b7/Incredible-hulk.jpg"},
            {"Thor", "Thor adalah sebuah pahlawan super fiksi yang muncul dalam buku-buku komik Amerika yang diterbitkan oleh Marvel Comics. Karakter tersebut, yang berdasarkan pada dewa mitologi Norse dengan nama yang sama, adalah dewa petir dan memegang sebuah palu, yang memberikannya kemampuan terbang dan mengendalikan cuaca.", "https://upload.wikimedia.org/wikipedia/id/4/41/Thor-272.jpg"},
            {"Doctor Strange", "Doctor Stephen Vincent Strange adalah pahlawan super fiksi yang muncul di American Comic Book dipublikasikan oleh Marvel Comics. Dibuat oleh artis dan konseptualis karakter Steve Ditko dan penulis Stan Lee, karakter pertama muncul di Strange Tales #110.", "https://upload.wikimedia.org/wikipedia/id/4/4f/Doctor_Strange_Vol_4_2_Ross_Variant_Textless.jpg"},
    };
    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}
