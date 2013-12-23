
package biletuygulamasi;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public  class JPanel_YolcuDuzenle extends javax.swing.JPanel {

    DosyaOkuYaz readwrite = new DosyaOkuYaz();
    static File yolcuFile = new File("src/db/yolcu.txt");
    static File tmpdosya = new File("src/db/tmp.txt");
    
    private BufferedReader bufReader;
    private BufferedWriter bufWriter;
    
    private boolean kayitVarMi=false;
    public  JPanel_YolcuDuzenle() {
        initComponents();
        jButton_YolcuDüzenle.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Panel_YolcuDuzenle = new java.awt.Panel();
        jButton_YolcuArat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_TCNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_YolcuDüzenle = new javax.swing.JButton();
        jTextField_YolcuAd = new javax.swing.JTextField();
        jTextField_YolcuSoyad = new javax.swing.JTextField();
        jTextField_Telefon = new javax.swing.JTextField();
        jComboBox_Cinsiyet = new javax.swing.JComboBox();
        jButton_Geri = new javax.swing.JButton();
        jButton_Temizle = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biletuygulamasi/images/ticket2.png"))); // NOI18N

        jButton_YolcuArat.setText("Yolcu Arat");
        jButton_YolcuArat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YolcuAratActionPerformed(evt);
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
        jLabel1.setText("Yolcu Düzenleme Paneli");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Yolcu Cinsiyet");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("TC No Giriniz : ");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Yolcu Telefon : ");

        jTextField_TCNo.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Yolcu Soyad :");

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Yolcu Ad : ");

        jButton_YolcuDüzenle.setText("Kaydet");
        jButton_YolcuDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YolcuDüzenleActionPerformed(evt);
            }
        });

        jTextField_YolcuAd.setEditable(false);
        jTextField_YolcuAd.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_YolcuSoyad.setEditable(false);
        jTextField_YolcuSoyad.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_Telefon.setEditable(false);
        jTextField_Telefon.setForeground(new java.awt.Color(51, 51, 51));

        jComboBox_Cinsiyet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Bay", "Bayan" }));

        jButton_Geri.setText("Geri");
        jButton_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GeriActionPerformed(evt);
            }
        });

        jButton_Temizle.setText("Temizle");
        jButton_Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_YolcuDuzenleLayout = new javax.swing.GroupLayout(Panel_YolcuDuzenle);
        Panel_YolcuDuzenle.setLayout(Panel_YolcuDuzenleLayout);
        Panel_YolcuDuzenleLayout.setHorizontalGroup(
            Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton_Geri)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Temizle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_YolcuArat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_YolcuDüzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_YolcuDuzenleLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2))
                                .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_YolcuSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_TCNo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_YolcuAd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_YolcuDuzenleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        Panel_YolcuDuzenleLayout.setVerticalGroup(
            Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(Panel_YolcuDuzenleLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField_TCNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_YolcuAd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_YolcuSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_YolcuDüzenle)
                    .addComponent(jButton_YolcuArat)
                    .addComponent(jButton_Geri)
                    .addComponent(jButton_Temizle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(Panel_YolcuDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_YolcuDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_YolcuDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_YolcuAratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YolcuAratActionPerformed
        try {
            yolcuArat();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_YolcuDuzenle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_YolcuAratActionPerformed

    public void yolcuArat() throws Exception
    {
       if( jTextField_TCNo.getText().equalsIgnoreCase("") )
	   JOptionPane.showMessageDialog(null, "Boş Alan Bırakmamalısınız...","HATA",JOptionPane.PLAIN_MESSAGE);
       else
       {
           String sCurrentLine;
           String yolcuID = jTextField_TCNo.getText().trim();
           BufferedReader bufReader = readwrite.dosyaOku(yolcuFile);
           while ((sCurrentLine = bufReader.readLine()) != null)
           {
                    String[] parcalar = sCurrentLine.split(" & ");
                    if(parcalar[2].equalsIgnoreCase(yolcuID))
                    {
                            jTextField_TCNo.setEditable(false);
                            jTextField_YolcuAd.setText(parcalar[0]); jTextField_YolcuAd.setEditable(true);
                            jTextField_YolcuSoyad.setText(parcalar[1]); jTextField_YolcuSoyad.setEditable(true);
                            if(parcalar[3].equalsIgnoreCase("Bay"))
                                jComboBox_Cinsiyet.setSelectedIndex(1);
                            else
                                jComboBox_Cinsiyet.setSelectedIndex(2);
                            jTextField_Telefon.setText(parcalar[4]); jTextField_Telefon.setEditable(true);
                            kayitVarMi=true;  
                    }
           }
           if(!kayitVarMi)
               JOptionPane.showMessageDialog(null, "Aradığınız TC'de Yolcu Bulunmamaktadır.","HATA",JOptionPane.PLAIN_MESSAGE);
           else
           {
               jButton_YolcuDüzenle.setVisible(true);
               JOptionPane.showMessageDialog(null, "Yolcu Bilgilerini Düzelttikten Sonra Kaydet Butonuna Basınız.","Hatırlatma",JOptionPane.PLAIN_MESSAGE);
           }
           bufReader.close();
       }
    }
    private void jButton_YolcuDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YolcuDüzenleActionPerformed
        try {
            yolcuDuzenle();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_YolcuDuzenle.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton_YolcuDüzenleActionPerformed

    private void jButton_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GeriActionPerformed
       SetVisible.visibleAyarla(BiletUygulamasi.PanelMenu);
       jTextField_TCNo.setText(""); jTextField_TCNo.setEditable(true);
       jTextField_YolcuAd.setText(""); jTextField_YolcuAd.setEditable(false);
       jTextField_YolcuSoyad.setText(""); jTextField_YolcuSoyad.setEditable(false);
       jTextField_Telefon.setText(""); jTextField_Telefon.setEditable(false);
       jComboBox_Cinsiyet.setSelectedIndex(0);
       kayitVarMi=false;
       jButton_YolcuDüzenle.setVisible(false);
    }//GEN-LAST:event_jButton_GeriActionPerformed

    private void jButton_TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TemizleActionPerformed
       jTextField_TCNo.setText(""); jTextField_TCNo.setEditable(true);
       jTextField_YolcuAd.setText(""); jTextField_YolcuAd.setEditable(false);
       jTextField_YolcuSoyad.setText(""); jTextField_YolcuSoyad.setEditable(false);
       jTextField_Telefon.setText(""); jTextField_Telefon.setEditable(false);
       jComboBox_Cinsiyet.setSelectedIndex(0);
       kayitVarMi=false;
       jButton_YolcuDüzenle.setVisible(false);
    }//GEN-LAST:event_jButton_TemizleActionPerformed

    public void yolcuDuzenle() throws Exception
    {
       int reply = JOptionPane.showConfirmDialog(null,"Kaydetmek İstediğinize Emin Misiniz?","ONAY", JOptionPane.YES_NO_OPTION);
       if(reply == JOptionPane.YES_OPTION)
       {
           String newRecord;
           String sCurrentLine;
           
           BufferedWriter bufWriterTmp = readwrite.dosyaYaz(tmpdosya);
           BufferedReader bufReader = readwrite.dosyaOku(yolcuFile);
           
           while ((sCurrentLine = bufReader.readLine()) != null)
           {
               String[] parcalar = sCurrentLine.split(" & ");
               if(parcalar[2].equalsIgnoreCase(jTextField_TCNo.getText().trim()))
               {
                   if(jTextField_Telefon.getText().equalsIgnoreCase(""))
                   {
                        if(jComboBox_Cinsiyet.getSelectedIndex()==1)
                            newRecord = jTextField_YolcuAd.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_TCNo.getText().trim()+" & Bay"+" & null";
                        else
                            newRecord = jTextField_YolcuAd.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_TCNo.getText().trim()+" & Bayan"+" & null";
                   }
                   else
                   {
                        if(jComboBox_Cinsiyet.getSelectedIndex()==1)
                            newRecord = jTextField_YolcuAd.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_TCNo.getText().trim()+" & Bay & "+jTextField_Telefon.getText();
                        else
                            newRecord = jTextField_YolcuAd.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_TCNo.getText().trim()+" & Bayan & "+jTextField_Telefon.getText();
                   }
                   sCurrentLine=newRecord;
               }
               bufWriterTmp.write(sCurrentLine);
               bufWriterTmp.newLine();
           }
           bufWriterTmp.close();
           bufReader.close();
           
           yolcuFile.delete();
           tmpdosya.renameTo(yolcuFile);
           JOptionPane.showMessageDialog(null, "Yolcu Bilgilerini Değiştirildi.","Başarılı",JOptionPane.PLAIN_MESSAGE);
           jButton_YolcuDüzenle.setVisible(false);
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Panel_YolcuDuzenle;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Geri;
    private javax.swing.JButton jButton_Temizle;
    private javax.swing.JButton jButton_YolcuArat;
    private javax.swing.JButton jButton_YolcuDüzenle;
    private javax.swing.JComboBox jComboBox_Cinsiyet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_TCNo;
    private javax.swing.JTextField jTextField_Telefon;
    private javax.swing.JTextField jTextField_YolcuAd;
    private javax.swing.JTextField jTextField_YolcuSoyad;
    // End of variables declaration//GEN-END:variables
}
