/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

class Kasiyer extends Thread {
     public static java.awt.List list1;
    private Musteri musteri;
       public static  List<Musteri>masadanKalkmamisAslindaSimdiKalkiyorKuyrugu = new ArrayList<>();
public static BlockingQueue<Musteri>kasayaGelenMusteriler;
    public Kasiyer(java.awt.List list1) {
       this.list1=list1;
    }
    public void odemeYap(){
        
    }

    @Override
    public void run() {
        while(!Sef.masadanKalkipOdemeyeGecenlerKuyrugu.isEmpty()){
        musteri=Sef.masadanKalkipOdemeyeGecenlerKuyrugu.remove(0);
        masadanKalkmamisAslindaSimdiKalkiyorKuyrugu.add(musteri);
        list1.add("Kasiyer musteri " + musteri.getMusteriID() + " icin odeme yapmaya basliyor.");
        System.out.println("Kasiyer musteri " + musteri.getMusteriID() + " icin odeme yapmaya basliyor.");
        try {
            Thread.sleep(2000); // 2 saniye içinde ödeme yapma simülasyonu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         list1.add("Kasiyer musteri " + musteri.getMusteriID() + " icin odeme yapmayi tamamladi.");
        System.out.println("Kasiyer musteri " + musteri.getMusteriID() + " icin odeme yapmayi tamamladi."); 
            
        }

    }
}