
package biletuygulamasi;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public  class JPanel_BiletIptal extends javax.swing.JPanel {

    DosyaOkuYaz readwrite = new DosyaOkuYaz();
    static File biletlerFile = new File("src/db/biletler.txt");
    static File tmpdosya = new File("src/db/tmp.txt");
    
    
    private BufferedReader bufReader;
    private BufferedReader bufReaderBiletler;
    private BufferedWriter bufWriter;
    
    String biletID;
    
    
    public  JPanel_BiletIptal() {
        initComponents();
        jButton_BiletSil.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Panel_BiletKes_OtobusBilgileri = new java.awt.Panel();
        jButton_BiletArat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Plaka = new javax.swing.JLabel();
        jLabel_KoltukNo = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Yolcu = new javax.swing.JLabel();
        jLabel_YolcuTC = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_BiletSil = new javax.swing.JButton();
        jButton_Geri = new javax.swing.JButton();
        Panel_BiletKes_KoltukBilgileri = new java.awt.Panel();
        jLabel_OtobusBilgisi = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biletuygulamasi/images/ticket2.png"))); // NOI18N

        jButton_BiletArat.setText("Bilet Arat");
        jButton_BiletArat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BiletAratActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Burak BEYKURT 2013");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("    burakbeykurt@gmail.com     ");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Bilet İptal Paneli");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Otobüs Plaka : ");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Bilet ID Giriniz : ");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Koltuk No : ");

        jLabel_Plaka.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel_Plaka.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_KoltukNo.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel_KoltukNo.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ID.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Yolcu Ad Soyad :");

        jLabel_Yolcu.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel_Yolcu.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_YolcuTC.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel_YolcuTC.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Yolcu TC No : ");

        jButton_BiletSil.setText("Bilet Sil");
        jButton_BiletSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BiletSilActionPerformed(evt);
            }
        });

        jButton_Geri.setText("Geri");
        jButton_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BiletKes_OtobusBilgileriLayout = new javax.swing.GroupLayout(Panel_BiletKes_OtobusBilgileri);
        Panel_BiletKes_OtobusBilgileri.setLayout(Panel_BiletKes_OtobusBilgileriLayout);
        Panel_BiletKes_OtobusBilgileriLayout.setHorizontalGroup(
            Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_BiletArat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_BiletSil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_Plaka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_Yolcu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_KoltukNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_YolcuTC, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        Panel_BiletKes_OtobusBilgileriLayout.setVerticalGroup(
            Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_YolcuTC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Yolcu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_KoltukNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_BiletSil)
                    .addComponent(jButton_BiletArat)
                    .addComponent(jButton_Geri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(Panel_BiletKes_OtobusBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)))
        );

        Panel_BiletKes_KoltukBilgileri.setPreferredSize(new java.awt.Dimension(589, 248));
        Panel_BiletKes_KoltukBilgileri.setVisible(false);

        jLabel_OtobusBilgisi.setFont(new java.awt.Font("Monotype Corsiva", 2, 14)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jButton4.setText("25");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_BiletKes_KoltukBilgileriLayout = new javax.swing.GroupLayout(Panel_BiletKes_KoltukBilgileri);
        Panel_BiletKes_KoltukBilgileri.setLayout(Panel_BiletKes_KoltukBilgileriLayout);
        Panel_BiletKes_KoltukBilgileriLayout.setHorizontalGroup(
            Panel_BiletKes_KoltukBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createSequentialGroup()
                .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel_OtobusBilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_BiletKes_KoltukBilgileriLayout.setVerticalGroup(
            Panel_BiletKes_KoltukBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BiletKes_KoltukBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_OtobusBilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(Panel_BiletKes_KoltukBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Panel_BiletKes_OtobusBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_BiletKes_OtobusBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_BiletKes_KoltukBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BiletAratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BiletAratActionPerformed
        try {
            biletArat();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_BiletIptal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_BiletAratActionPerformed

    public void biletArat() throws Exception
    {
       if( jTextField_ID.getText().equalsIgnoreCase("") )
	   JOptionPane.showMessageDialog(null, "Boş Alan Bırakmamalısınız...","HATA",JOptionPane.PLAIN_MESSAGE);
       else
       {
           Boolean kayitVarMi=false;
           String sCurrentLine;
           biletID = jTextField_ID.getText();
           BufferedReader bufReaderBilet = readwrite.dosyaOku(biletlerFile);
           while ((sCurrentLine = bufReaderBilet.readLine()) != null)
           {
                    String[] parcalar = sCurrentLine.split(" & ");
                    if(!parcalar[0].equalsIgnoreCase("ID"))
                    {
                        if(parcalar[5].equalsIgnoreCase(biletID))
                        {
                            jLabel_YolcuTC.setText(parcalar[0]);
                            jLabel_Yolcu.setText(parcalar[1]+" "+parcalar[2]);
                            jLabel_Plaka.setText(parcalar[3]);
                            jLabel_KoltukNo.setText(parcalar[4]);
                            kayitVarMi=true;
                        }
                    }
           }
           if(!kayitVarMi)
               JOptionPane.showMessageDialog(null, "Aradığınız ID'de Bilet Bulunmamaktadır.","HATA",JOptionPane.PLAIN_MESSAGE);
           else
           {
               jButton_BiletSil.setVisible(true);
               //jTextField_ID.setEditable(false);
           }
           bufReaderBilet.close();
       }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton_BiletSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BiletSilActionPerformed
        try {
            biletSil();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_BiletIptal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton_BiletSilActionPerformed

    private void jButton_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GeriActionPerformed
           SetVisible.visibleAyarla(BiletUygulamasi.PanelMenu);
           jLabel_YolcuTC.setText("");
           jLabel_Yolcu.setText("");
           jLabel_Plaka.setText("");
           jLabel_KoltukNo.setText("");
           jTextField_ID.setText("");
           jButton_BiletSil.setVisible(false);
    }//GEN-LAST:event_jButton_GeriActionPerformed

    public void biletSil() throws Exception
    {
       int reply = JOptionPane.showConfirmDialog(null,"Bilet İptal İşlemini Onaylıyor Musunuz?","ONAY", JOptionPane.YES_NO_OPTION);
       if(reply == JOptionPane.YES_OPTION)
       {
           String newRecord, newRecord2;
           String sCurrentLine;
           
           BufferedWriter bufWriterTmp = readwrite.dosyaYaz(tmpdosya);
           BufferedReader bufReaderBiletler = readwrite.dosyaOku(biletlerFile);
           
           while ((sCurrentLine = bufReaderBiletler.readLine()) != null)
           {
               String[] parcalar = sCurrentLine.split(" & ");
               if(parcalar[0].equalsIgnoreCase("ID"))
               {
                   bufWriterTmp.write(sCurrentLine);
                   bufWriterTmp.newLine();
               }
               else if(!parcalar[5].equalsIgnoreCase(jTextField_ID.getText()))
               {
                   bufWriterTmp.write(sCurrentLine);
                   bufWriterTmp.newLine();
               }
           }
           bufWriterTmp.close();
           bufReaderBiletler.close();
           
           biletlerFile.delete();
           tmpdosya.renameTo(biletlerFile);
           JOptionPane.showMessageDialog(null, "Bilet İptal İşleminiz Gerçekleştirildi","Onaylandı",JOptionPane.PLAIN_MESSAGE);
           jLabel_YolcuTC.setText("");
           jLabel_Yolcu.setText("");
           jLabel_Plaka.setText("");
           jLabel_KoltukNo.setText("");
           jTextField_ID.setText("");
           reply = JOptionPane.showConfirmDialog(null,"Bilet İptal İşlemine Devam Etmek İstiyor Musunuz?","Devam?", JOptionPane.YES_NO_OPTION);
           if(reply != JOptionPane.YES_OPTION)
           {
                SetVisible.visibleAyarla(BiletUygulamasi.PanelMenu);
           }
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Arama İşlemini İptal Ettiniz.Menüye Aktarılıyorsunuz.","Uyarı",JOptionPane.PLAIN_MESSAGE);
           SetVisible.visibleAyarla(BiletUygulamasi.PanelMenu);
           jLabel_YolcuTC.setText("");
           jLabel_Yolcu.setText("");
           jLabel_Plaka.setText("");
           jLabel_KoltukNo.setText("");
           jTextField_ID.setText("");
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Panel_BiletKes_KoltukBilgileri;
    private java.awt.Panel Panel_BiletKes_OtobusBilgileri;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_BiletArat;
    private javax.swing.JButton jButton_BiletSil;
    private javax.swing.JButton jButton_Geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_KoltukNo;
    private javax.swing.JLabel jLabel_OtobusBilgisi;
    private javax.swing.JLabel jLabel_Plaka;
    private javax.swing.JLabel jLabel_Yolcu;
    private javax.swing.JLabel jLabel_YolcuTC;
    private javax.swing.JTextField jTextField_ID;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
