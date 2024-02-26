/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder1;

import java.util.ArrayList;
import java.util.List;

public class Sef extends Thread {

    private int sefID;
    private boolean busy = false;
 public static java.awt.List list1;
    public static  List<Musteri>masadanKalkipOdemeyeGecenlerKuyrugu = new ArrayList<>();
    public Sef(int sefID) {
        this.sefID = sefID;
    }
     public Sef(int sefID,java.awt.List list1) {
        this.list1=list1; 
        this.sefID = sefID;
    }

    @Override
    public void run() {
        // Şefin hazırlama süreci
        while (true) {
            try {
                Thread.sleep(3000); // Örnek: 3 saniye içinde hazırlama
                    setBusy(false);//burası vardı normalde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void hazirlaVeTeslimEt(Musteri musteri) {
       // setBusy(true);
       
         list1.add("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi hazirliyor.");
        System.out.println("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi hazirliyor.");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        // Sipariş hazırlama süreci
             //  Thread.sleep(2000); hata alıyorum 
         list1.add("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi hazirladi.");
        System.out.println("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi hazirladi.");
           list1.add("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi garsona teslim ediyor.");
       System.out.println("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi garsona teslim ediyor.");
       masadanKalkipOdemeyeGecenlerKuyrugu.add(musteri);
       
   setBusy(true); ///yeni 17 30 yoruma ldım
        // Garsona teslim et
       // garsonaTeslimEt(musteri);
    
          //  setBusy(false);
    }

    private void garsonaTeslimEt(Musteri musteri) {
        System.out.println("Sef " + sefID + " musteri " + musteri.getMusteriID() + " icin yemegi garsona teslim ediyor.");
        // Eklenen kısım: Garsona teslim etme işlemi tamamlandıktan sonra ekrana mesaj bas
        //    System.out.println("Sef " + sefID + " yemegini teslim etti, Garson " + musteri.getGarsonID() + " siparisi teslim aldi.");

    }

    public boolean isBusy() {
        return busy;
    }
    /// meşgul olup olmama durumuna göre 
    ///// set busy ile ayarlama yapıyoruzzzzzzzzzzzzzzzzzzzzzz

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
}