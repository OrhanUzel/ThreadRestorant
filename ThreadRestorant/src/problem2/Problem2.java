/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem2;

/**
 *
 * @author Orhan UZEL
 */
import java.util.Scanner;
public class Problem2 {

	 public static void main(String[] args) {
             try (Scanner kinput = new Scanner(System.in)) {
                 System.out.print("Ayrilan musteri sayisi: ");
                 int ayrilanMusteri = kinput.nextInt();
                 System.out.print("Toplam sure Saniye cinsinde: ");
                 int toplamSure = kinput.nextInt();
                 System.out.print("Musteri gelme araligi Saniye cinsinden : ");
                 int musteriAraligi = kinput.nextInt();
                 // En iyi çözümü bul ve ekrana yazdır
                 enIyiCozumuBul(toplamSure, ayrilanMusteri, musteriAraligi);
                 //kinput.nextString();
             }
	    }

	    static class Cozum {
	        //tanımlamalar kısmııı 
                int masaSayisi;
	        int garsonSayisi;
	        int asciSayisi;
	        int kar;

	        Cozum(int masaSayisi, int garsonSayisi, int asciSayisi, int kar) {
	            this.masaSayisi = masaSayisi;
	            this.garsonSayisi = garsonSayisi;
	            this.asciSayisi = asciSayisi;
	            this.kar = kar;
	        }
	    }
///en iyi içözüm bulmak için burayı kullanıyoruzz
            
	    static void enIyiCozumuBul(int toplamSure, int ayrilanMusteri, int musteriAraligi) {
	        int toplamMusteri = toplamSure / musteriAraligi;
	        int normalMusteriSayisi = toplamMusteri - ayrilanMusteri;
	        Cozum enIyiCozum = null;
	        int enIyiKar = 0;
//en yii kar 0 olarka belirlendi 
	        for (int masaSayisi = 1; masaSayisi <= 20; masaSayisi++) {
	            for (int garsonSayisi = 1; garsonSayisi <= 8; garsonSayisi++) {
	                for (int asciSayisi = 1; asciSayisi <= 2; asciSayisi++) {
	                    int kar = hesaplaKazanc(normalMusteriSayisi, masaSayisi, garsonSayisi, asciSayisi);
     // kar >en iyi kar yaptıkkk buradaa 
	                    if (kar > enIyiKar) {
	                     
                                enIyiKar = kar;
	                     //en iyi kar ı burada belirliyoruz
                                enIyiCozum = new Cozum(masaSayisi, garsonSayisi, asciSayisi, kar);
	                    }
	                }
	            }
	        }

	        if (enIyiCozum != null) {//eniyiçzoumler nulle eşit eğilse
	            // En iyi çözümü ekrana yazdır
	            System.out.println("En iyi problem cozumu : " + enIyiCozum.kar +
	                    " kar icin " + enIyiCozum.masaSayisi + " masa, " +
	                    enIyiCozum.garsonSayisi + " garson, " + enIyiCozum.asciSayisi + " asci." + "  toplam musteri: " + toplamMusteri);
	        }
                else{
                    System.out.println("Malesef cozumunuz hesaplanamamisttir.");
                }
	    }
///////////////////////////////////////////////////kazanç
	    static int hesaplaKazanc(int normalMusteriSayisi, int masaSayisi, int garsonSayisi, int asciSayisi) {
	        if (normalMusteriSayisi > 0) {// normal müşteri büyüktür 0dan ise girecek 
	            int masaKapasitesi = masaSayisi * garsonSayisi * asciSayisi;
	            int gercekMusteriSayisi = Math.min(normalMusteriSayisi, masaKapasitesi);
//////              kalan gerçek müşteri sayısıı
	            return gercekMusteriSayisi - masaSayisi - garsonSayisi - asciSayisi;
	        } else {
	            return 0;
	        }
	    }
}