/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package folder1;

import java.awt.Color;
import static java.awt.PageAttributes.MediaType.C;
import java.util.Random;
import javax.swing.JTextPane;

/**
 *
 * @author Orhan UZEL
 */
public class MusteriEkrani extends javax.swing.JFrame {
    int belirtec=0;
//Restoran restoran;
    Random random=new Random();
    Restoran  restoran=new Restoran();
 JTextPane jtext;
  int oturanlar;
public  GarsonEkrani garsonEkrani=new GarsonEkrani(this,restoran);
//public AsciEkrani asciEkrani=new AsciEkrani(garsonEkrani,restoran);
//public KasaEkrani kasaEkrani=new KasaEkrani(asciEkrani,restoran);
 
    /**
     * Creates new form Yazlab
     */
    public MusteriEkrani() {
        
      //  Restoran restoran=new Restoran(garsonEkrani.textSiparisler);
        initComponents();
         this.setLocationRelativeTo(null);//açılan ekranı merkezde konumlandııyor
         setLocation(0, 0);
         this.setSize(700, 500);
     
      //     masalariGuncelle();
      
    }
  public final void  masalariGuncelle(){
         
          if(oturanlar<Restoran.oturanMusteriListesi.size()&&oturanlar!=0){
              int kalkanlar=oturanlar-Restoran.oturanMusteriListesi.size();
              switch (kalkanlar) {
                  case 1:
                      jToggleButton7.setBackground(Color.RED);
                      break;
                      case 2:
                      jToggleButton6.setBackground(Color.WHITE);
                      break;
                      case 3:
                      jToggleButton5.setBackground(Color.WHITE);
                      break;
                      case 4:
                      jToggleButton4.setBackground(Color.WHITE);
                      break;
                  default:
                      throw new AssertionError();
              }
          } 
          
        
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        list1 = new java.awt.List();
        listeOturanlar = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        listOlusanTumMusteriler = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        btnMasalaraOturt = new java.awt.Button();
        label2 = new java.awt.Label();
        yasliSayisi = new java.awt.TextField();
        label1 = new java.awt.Label();
        normalSayisi = new java.awt.TextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 130, 170));

        listeOturanlar.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(listeOturanlar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 200, 170));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Oturan Müşteriler");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 140, 20));

        listOlusanTumMusteriler.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(listOlusanTumMusteriler, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 230));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Oluşturulan Tüm Müşteriler");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 240, -1));

        jToggleButton5.setBackground(new java.awt.Color(255, 204, 204));
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton5.setText("4");
        jToggleButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jToggleButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jPanel1.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jToggleButton6.setBackground(new java.awt.Color(255, 204, 204));
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton6.setText("5");
        jToggleButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jToggleButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jPanel1.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jToggleButton3.setBackground(new java.awt.Color(255, 204, 204));
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton3.setText("2");
        jToggleButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jToggleButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jToggleButton7.setBackground(new java.awt.Color(255, 204, 204));
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton7.setText("6");
        jToggleButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jToggleButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jPanel1.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, -1));

        jToggleButton2.setBackground(new java.awt.Color(255, 204, 204));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton2.setText("1");
        jToggleButton2.setName(""); // NOI18N
        jToggleButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jToggleButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 110, 70));

        jToggleButton4.setBackground(new java.awt.Color(255, 204, 204));
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton4.setText("3");
        jToggleButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/table (2).png"))); // NOI18N
        jToggleButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jToggleButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/folder1/resimler/order-food (1).png"))); // NOI18N
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Garsona Git");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 100, 40));

        btnMasalaraOturt.setBackground(new java.awt.Color(255, 204, 204));
        btnMasalaraOturt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasalaraOturt.setLabel("Masalara Oturt");
        btnMasalaraOturt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasalaraOturtActionPerformed(evt);
            }
        });
        jPanel1.add(btnMasalaraOturt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 130, 50));

        label2.setText("oluşturmak istediğiniz öncelikli müşteri sayısını giriniz");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        yasliSayisi.setBackground(new java.awt.Color(255, 204, 204));
        yasliSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yasliSayisiActionPerformed(evt);
            }
        });
        jPanel1.add(yasliSayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 50, 20));

        label1.setText("oluşturmak istediğiniz normal müşteri sayısını giriniz");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        normalSayisi.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(normalSayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 50, 20));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("Müşterileri Oluştur");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Masaları Güncelle");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        label3.setText("20 sn bekleyip masaya oturamadan ayrılanlar");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 170, 20));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("oturamadan ayrılanları güncelle");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //  while(true){//  masaaları güncelleme
            if(!Kasiyer.masadanKalkmamisAslindaSimdiKalkiyorKuyrugu.isEmpty()){//size 4 mesela //Sef.masadanKalkipOdemeyeGecenlerKuyrugu ile güzel çalişiyordu değiştirdim artık kasada işlemi bitnce masadan kalkacak
                for(int i=0;i<Restoran.oturduguYerdeKalanMusteriListesi.size();i++){//listeOturanlar.getRows() ortada bu vardı normalde
                    for(int j=0;j<Kasiyer.masadanKalkmamisAslindaSimdiKalkiyorKuyrugu.size();j++){
                        if(Kasiyer.masadanKalkmamisAslindaSimdiKalkiyorKuyrugu.get(j)==Restoran.oturduguYerdeKalanMusteriListesi.get(i)){
                            Restoran.oturduguYerdeKalanMusteriListesi.remove(i);
                            if(Restoran.musteriListesi.size()>6&&Restoran.musteriListesi.size()!=6){
                                Restoran.oturduguYerdeKalanMusteriListesi.add( Restoran.musteriListesi.remove(6)); //Restoran.musteriListesi.size()-1
                            }
                        }
                    }
                }
                listeOturanlar.removeAll();
                for(int i=0;i<Restoran.oturduguYerdeKalanMusteriListesi.size();i++){
                    listeOturanlar.add(Restoran.oturduguYerdeKalanMusteriListesi.get(i).name+" yaş: "+Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas);//deneyelim bakalım
                }
                //         int yeniOturacaklar=6-Restoran.oturduguYerdeKalanMusteriListesi.size();
                //         int tumMusteriler=Restoran.musteriListesi.size();
                //         for(int i=(tumMusteriler-6);i<tumMusteriler;i++){///altta remove vardı
                    //             for(int j=0;j<6;j++){
                        //             if(Restoran.musteriListesi.get(i).name!=Restoran.oncekiOturanlarListesi.get(j).name){
                            //                  listeOturanlar.add(Restoran.musteriListesi.get(i).name);
                            //             }
                        //             }
                    //            // listeOturanlar.add(Restoran.bekleyenMusteriListesi.remove(i).name);//buradaki 4 satırı müşteriler ayrıldıkları zaman bekleyen müşteriler masaya otursun diye var
                    //         }
            }
            
            //   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int yasliS= Integer.parseInt(yasliSayisi.getText());
        int normalS= Integer.parseInt(normalSayisi.getText());

        this.restoran.musteriOlustur(yasliS, normalS);
        for(int i=0;i<Restoran.musteriListesi.size();i++){
            listOlusanTumMusteriler.add(Restoran.musteriListesi.get(i).name+"  yas: "+Restoran.musteriListesi.get(i).yas,i);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void yasliSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yasliSayisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yasliSayisiActionPerformed

    private void btnMasalaraOturtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasalaraOturtActionPerformed
        oturanlar=Restoran.oturduguYerdeKalanMusteriListesi.size();
        int a=0;
        if(belirtec!=0){
            jToggleButton2.setSelected(false);
            jToggleButton3.setSelected(false);
            jToggleButton4.setSelected(false);
            jToggleButton5.setSelected(false);
            jToggleButton6.setSelected(false);
            jToggleButton7.setSelected(false);
            jToggleButton2.setBackground(Color.PINK);
            jToggleButton3.setBackground(Color.PINK);
            jToggleButton4.setBackground(Color.PINK);
            jToggleButton5.setBackground(Color.PINK);
            jToggleButton6.setBackground(Color.PINK);
            jToggleButton7.setBackground(Color.PINK);

        }
        // belirtec++;
        //oturanMusteriListesi var normalde bakalım bi şiyler degişçekmi
        for(int i=0;i<Restoran.oturduguYerdeKalanMusteriListesi.size();i++){
            switch (i) {
                case 0:
                jToggleButton2.setSelected(true);

                //  jToggleButton2.setIcon(C:\\Users\\Orhan UZEL\\Documents\\NetBeansProjects\\aaaaaaaaThreadlers\\src\\folder1\\resimler\\table (2).png);
                if(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas>65){
                    jToggleButton2.setBackground(Color.BLUE);

                }
                else{
                    jToggleButton2.setBackground(Color.YELLOW);
                }

                break;
                case 1:
                jToggleButton3.setSelected(true);
                if(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas>65){
                    jToggleButton3.setBackground(Color.BLUE);
                }
                else{
                    jToggleButton3.setBackground(Color.YELLOW);
                }
                break;
                case 2:
                jToggleButton4.setSelected(true);
                if(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas>65){
                    jToggleButton4.setBackground(Color.BLUE);
                }
                else{
                    jToggleButton4.setBackground(Color.YELLOW);
                }
                break;
                case 3:
                jToggleButton5.setSelected(true);
                if(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas>65){
                    jToggleButton5.setBackground(Color.BLUE);
                }
                else{
                    jToggleButton5.setBackground(Color.YELLOW);
                }
                break;
                case 4:
                jToggleButton6.setSelected(true);
                if(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas>65){
                    jToggleButton6.setBackground(Color.BLUE);
                }
                else{
                    jToggleButton6.setBackground(Color.YELLOW);
                }
                break;
                case 5:
                jToggleButton7.setSelected(true);
                if(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas>65){
                    jToggleButton7.setBackground(Color.BLUE);
                }
                else{
                    jToggleButton7.setBackground(Color.YELLOW);
                }
                break;

                default:
                    break;
                //throw new AssertionError();
            }

            if(belirtec==0){
                listeOturanlar.add(Restoran.oturduguYerdeKalanMusteriListesi.get(i).name+" yaş: "+Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas, i);
                //  list1.add(Restoran.oturduguYerdeKalanMusteriListesi.get(i).name, i);
                // list2.add(String.valueOf(Restoran.oturduguYerdeKalanMusteriListesi.get(i).yas));
                // buralarda da oturanMusteriListesi var idi
            }

        }

        belirtec++;

        // masalariGuncelle();//sonsuz döngüye girip saçmalıyor sürekli olarak

    }//GEN-LAST:event_btnMasalaraOturtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //GarsonEkrani garsonEkrani=new GarsonEkrani(this,restoran);
        garsonEkrani.setVisible(true);
        //  this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     if(!Restoran.suredenDolayiRestorandanAyrilanlar.isEmpty()){
        list1.removeAll();
         for(int i=0;i<Restoran.suredenDolayiRestorandanAyrilanlar.size();i++){
         list1.add(Restoran.suredenDolayiRestorandanAyrilanlar.get(i).name);
        }
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new MusteriEkrani().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnMasalaraOturt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.List list1;
    private java.awt.List listOlusanTumMusteriler;
    private java.awt.List listeOturanlar;
    private java.awt.TextField normalSayisi;
    private java.awt.TextField yasliSayisi;
    // End of variables declaration//GEN-END:variables
}
