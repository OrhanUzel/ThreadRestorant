/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder1;

import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;

public class Garson extends Thread {

    private int garsonID;
    private List<Musteri> musteriListesi;
    private List<Musteri> bekleyenMusteriListesi;
      private List<Musteri> oturanMusteriListesi;
    private List<Sef> sefListesi;
    public static java.awt.List list1;
public static TextArea textSiparisler;
  public static List<String>texteYazilacaklar;
 public static  List<Garson> garsonListesi = new ArrayList<>();
    public Garson(int garsonID, List<Musteri> musteriListesi, List<Musteri> bekleyenMusteriListesi, List<Sef> sefListesi,List<String>texteYazilacaklar) {
        this.texteYazilacaklar=texteYazilacaklar;
        this.textSiparisler=textSiparisler;
        this.garsonID = garsonID;
        this.musteriListesi = musteriListesi;
        this.bekleyenMusteriListesi = bekleyenMusteriListesi;
        this.sefListesi = sefListesi;
    }
     public Garson(int garsonID, List<Musteri> musteriListesi, List<Musteri> bekleyenMusteriListesi, List<Sef> sefListesi,java.awt.List list1,List<Musteri> oturanMusteriListesi) {
        this.oturanMusteriListesi=oturanMusteriListesi;
         this.list1=list1;
       //  this.texteYazilacaklar=texteYazilacaklar;
        this.textSiparisler=textSiparisler;
        this.garsonID = garsonID;
        this.musteriListesi = musteriListesi;
        this.bekleyenMusteriListesi = bekleyenMusteriListesi;
        this.sefListesi = sefListesi;
    }
    
    
    
    public void garsonCalistir(){
         // 3 garson oluştur
        for (int i = 1; i <= 3; i++) {
            garsonListesi.add(new Garson(i, musteriListesi, bekleyenMusteriListesi, sefListesi,Restoran.texteYazilacaklar));
          //  textSiparisler.setText((Garson.textSiparisler.getText()));
            
        }
        
        
        for (Garson garson : garsonListesi) {
            
            garson.start();
        }
        //return textSiparisler;
    }

    @Override
    public void run() {
        while (true) {
            Musteri musteri = null;

            synchronized (oturanMusteriListesi) {
                if (!oturanMusteriListesi.isEmpty()) {
                    musteri = oturanMusteriListesi.remove(0);//musteriListesi ve burada remove komutu vardıııııı
                }//get yaptığımda daima müşteri 1 ile iş yapılmaya başlandı saçmaldaııı
            }

            if (musteri != null) {
                servisVer(musteri, (ArrayList<String>) Restoran.texteYazilacaklar);
            } else {
                // Bekleyen müşteri var mı kontrol et
                synchronized (bekleyenMusteriListesi) {
                    if (!bekleyenMusteriListesi.isEmpty()) {
                        musteri = bekleyenMusteriListesi.remove(0);
                        musteri.otur();
                    }
                }

                if (musteri == null) {
                    // Müşteri kalmadığında garson bekler
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void servisVer(Musteri musteri,ArrayList<String>texteYazilacaklar) {
       // textSiparisler.setText("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi aliyor.");
       list1.add("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi aliyor.");
  // texteYazilacaklar.add("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi aliyor.");
   //texteYazilacaklar.set(0, "naberr");
        System.out.println("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi aliyor.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Garson.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Siparişi şefe gönder
        Sef sef=null;
        while(true){//while true kısmı sonradan oluşturduğum şefler çalışsın diye  ekledim bakalım olacak mı 
            if(Restoran.sefListesi.size()!=0&&Restoran.sefListesi.get(0).isBusy()==false){
                sef=Restoran.sefListesi.get(0);
                sef.hazirlaVeTeslimEt(musteri);////////////////////// ikiistırıa alttaki en son yazdım saat 23 e doğru  
            list1.add("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi teslim ediyor.");
             System.out.println("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi teslim ediyor.");
            break;
            }
            else if(Restoran.sefListesi.size()!=0&&Restoran.sefListesi.get(1).isBusy()==false){
                sef=Restoran.sefListesi.get(1);
                sef.hazirlaVeTeslimEt(musteri);////////////////////// ikiistırıa alttaki en son yazdım saat 23 e doğru  
            list1.add("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi teslim ediyor.");
             System.out.println("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi teslim ediyor.");
            break;
            }
            else{
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                
            }
        //    Sef sef=Restoran.sefListesi.get(0);//23 de yeni yazdım
         //   Sef sef = getAvailableSef();//////kendim burada şeflerin rastgele oluşmasını sağlayabilirimmm lütfen nnn
//        if (sef != null) {
//            sef.hazirlaVeTeslimEt(musteri);////////////////////// ikiistırıa alttaki en son yazdım saat 23 e doğru  
//            list1.add("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi teslim ediyor.");
//             System.out.println("Garson " + garsonID + " musteri " + musteri.getMusteriID() + " icin siparisi teslim ediyor.");
//            break;
//        }
        }
        
    }
//şefff kullanılabilir mi onu kontrol ediyorrrrrrrr 
    private Sef getAvailableSef() {
        synchronized (sefListesi) {
            for (Sef sef : sefListesi) {
                if (!sef.isBusy()) {
                    return sef;
                }
            }
        }
        return null;
    }
}