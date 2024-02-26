package folder1;


import java.awt.TextArea;
import java.util.Random;

import java.util.List;

import java.util.ArrayList;






public class Restoran {
     public static  List<Musteri> suredenDolayiRestorandanAyrilanlar = new ArrayList<>();
   public static  List<Musteri> oturanMusteriListesi = new ArrayList<>();
    public static  List<Musteri> oturduguYerdeKalanMusteriListesi = new ArrayList<>();
      public static  List<Musteri> oncekiOturanlarListesi = new ArrayList<>();
   public static  List<Garson> garsonListesi = new ArrayList<>();
   public static  List<Musteri> musteriListesi = new ArrayList<>();
   public static  List<Musteri> bekleyenMusteriListesi = new ArrayList<>();
   public static  List<String> texteYazilacaklar  = new ArrayList<>();
   public static List<Sef> sefListesi = new ArrayList<>();
//JTextPane textSiparisler;
    public Restoran() {
  //      this.textSiparisler=textSiparisler;
    }
   
   
   
    public void musteriOlustur(int yasliSayisi,int normalSayisi){
         
        
      
   //   List<Garson> garsonListesi = new ArrayList<>();
       
        Random random = new Random();

       

//        // 2 şef oluştur
//        for (int i = 1; i <= 2; i++) {
//            Sef sef = new Sef(i);
//            sefListesi.add(sef);
//            sef.start();
//        }
        int oturanMusteriSayisi = 0;
     // int  yasliS=yasliSayisi;
     //  int normalS=normalSayisi;
              int yas = 0 ;
        // 7 müşteri oluştur ve 65 yaş üstü müşterileri oturt
        for (int i = 1; i <=(yasliSayisi+normalSayisi); i++) {////0 ortada i yerine 0 varmış 20 dakka felan bunu çözmeye çalıştırm
            if(i<=yasliSayisi){
                   yas = random.nextInt(35) + 66;
                Musteri musteri = new Musteri(yas, "musteri" + i); 
              musteriListesi.add(musteri);
            }
            else{
                  yas = random.nextInt(50) + 15;
              Musteri musteri = new Musteri(yas, "musteri" + i);
              musteriListesi.add(musteri);
            }
         
            }
       //  for (int i = 1; 0 <=(yasliSayisi+normalSayisi); i++) {
//       for(Musteri musteri:musteriListesi){  
//       if(i<yasliS){
//                 yas = random.nextInt(35) + 65;
//                          
//             // Musteri musteri = new Musteri(yas, "musteri" + i); 
//              //musteriListesi.add(musteri);
//            }
//         else{
//           // if(i<normalS){
//              yas = random.nextInt(50) + 15;
//           // Musteri musteri = new Musteri(yas, "musteri" + i); 
//             // musteriListesi.add(musteri);
//            }
//         }
        
        
        
        
        
        
             for (Musteri musteri:musteriListesi) {
         //   int yas = random.nextInt(90) + 15;
         //   Musteri musteri = new Musteri(yas, "musteri" + i);
            if (musteri.yas > 65 && oturanMusteriSayisi < 6) { //sadece yas vardı burada musteri.yas ekledim 
                oturanMusteriListesi.add(musteri);
                oturduguYerdeKalanMusteriListesi.add(musteri);//songün güncellemelerinden dikkatli olll
                oncekiOturanlarListesi.add(musteri);
                musteri.otur();
                oturanMusteriSayisi++;
                musteri.setOturabilir(false); // Oturduktan sonra bir daha oturamaz
            }

                   // musteriListesi.add(musteri);
        }

        // Diğer müşterilere 20 saniye süre tanı
        for (Musteri musteri : musteriListesi) {
            musteri.start();
        }

        // 5 müşteri masaya otursun
        //   Random random=new Random();
        for (Musteri musteri : musteriListesi) {
            if (!musteri.oturduMu() && oturanMusteriSayisi < 6) {
                 oturanMusteriListesi.add(musteri);
                 oturduguYerdeKalanMusteriListesi.add(musteri);
                 oncekiOturanlarListesi.add(musteri);
                musteri.otur();
                musteri.setGarsonID(random.nextInt(3)); // Hangi garsona hizmet alacak
                oturanMusteriSayisi++;
            } else {
                // Masaya oturamayan müşteriyi bekleyenlere ekle
                synchronized (bekleyenMusteriListesi) {
                    if (bekleyenMusteriListesi.size() < 6) {
                        bekleyenMusteriListesi.add(musteri);
                    } else {
                        break;
                    }
                }
            }
        }

//        // Garsonları çalıştır
//        for (Garson garson : garsonListesi) {
//            garson.start();
//        }
    }
    
    public void garsonCalistir(TextArea textSiparisler){
         // 3 garson oluştur
        for (int i = 1; i <= 3; i++) {
            garsonListesi.add(new Garson(i, musteriListesi, bekleyenMusteriListesi, sefListesi,texteYazilacaklar));
          //  textSiparisler.setText((Garson.textSiparisler.getText()));
            
        }
        
        
        for (Garson garson : garsonListesi) {
            
            garson.start();
        }
        //return textSiparisler;
    }
    public void SefCalistir(){
       
         // 2 şef oluştur
        for (int i = 1; i <= 2; i++) {
            Sef sef = new Sef(i);
            sefListesi.add(sef);
            sef.start();
        }
        
        
    }
    
    

    public static void main(String[] args) {

    
    }
}

