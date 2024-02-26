/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder1;


public class Musteri extends Thread {

    String name;
    int yas;
    private static int musteriCounter = 0;
    private int musteriID;
    private boolean oturdu = false;
    private boolean oturabilir = true; //yaslilalr içinnnn
    private int garsonID; // aldığın garsonn numarasııı

    public Musteri(int yas, String name) {
        this.name = name;
        this.yas = yas;
        musteriID = ++musteriCounter;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000); // Örnek: 20 saniye içinde masaya oturması gerekiyor
            if (!oturdu && oturabilir) {
                System.out.println("Musteri " + musteriID + " masaya oturamadi ve restorandan ayriliyor.");
               Restoran.musteriListesi.remove(this);/// değiştirdim en sonunda 19 55
             Restoran.suredenDolayiRestorandanAyrilanlar.add(this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void otur() {
        if (!oturdu && oturabilir) {
            //masaya oturabiliyorsa yorsa oturmasını sağla
            oturdu = true;
            System.out.println("Musteri " + musteriID + " masaya oturdu " + yas + " yasinda.");
        }
    }
///// yorum satırları
    // müşterinin idsini çekmek için            burasıııııı.
    public int getMusteriID() {
        return musteriID;
    }
/////oturup oturmamamsını kontrol amaçlı
    public boolean oturduMu() {
    //    oturup oturmamamsını kontrol amaçlı
        return oturdu;
    }
// müşterilerrrr oturabilme ve oturamama mdurumları var  burada 
    public void setOturabilir(boolean oturabilir) {
        //oturabiliyorsa oturabilir dönnn............
        this.oturabilir = oturabilir;
    }
//
    ///////////çok önemli değil gibi  buraları genele kullanmıyorumm
    public void setGarsonID(int garsonID) {
        this.garsonID = garsonID;
    }

    public int getGarsonID() {
        return garsonID;
    }
}