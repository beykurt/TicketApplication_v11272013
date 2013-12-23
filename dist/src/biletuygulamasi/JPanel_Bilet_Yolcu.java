/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biletuygulamasi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class JPanel_Bilet_Yolcu extends javax.swing.JPanel {

    DosyaOkuYaz readwrite = new DosyaOkuYaz();
    static File yolcuFile = new File("src/db/yolcu.txt");
    static File biletlerFile = new File("src/db/biletler.txt");
    static File tmpdosya = new File("src/db/tmp.txt");
    static File koltukDurumuFile = new File("src/db/koltukDurumu.txt");
    
    private BufferedReader bufReader;
    private BufferedWriter bufWriter;
    private BufferedWriter bufWriterTmp;
    
    private String tumBilgiler, plaka ;
    private int koltukNo;
    private boolean tamamlandiMi=false;
    
    public JPanel_Bilet_Yolcu() 
    {
        initComponents();
    }

    public void setBilgiler(String Plaka, String KoltukNo)
    {
        this.plaka=Plaka;
        this.koltukNo=Integer.parseInt(KoltukNo);
        jButton_Kaydet.setVisible(false);
        //panel_yolcuKaydet.setVisible(false);
        jTextField_YolcuIsim.setEditable(false);
        jTextField_YolcuSoyad.setEditable(false);
        jTextField_Telefon.setEditable(false);
        jComboBox_Cinsiyet.setEditable(false);
        jLabel4.setText(Plaka+" Plakalı Otobüs - "+KoltukNo+" Numaralı Koltuk ");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel_yolcuKaydet = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_YolcuIsim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_YolcuSoyad = new javax.swing.JTextField();
        jButton_Kaydet = new javax.swing.JButton();
        jTextField_Telefon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_Cinsiyet = new javax.swing.JComboBox();
        jTextField_YolcuTCNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_Devam = new javax.swing.JButton();
        jButton_Geri = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 429));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Yolcu Bilgilerini Giriniz");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biletuygulamasi/images/ticket2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Otobüs ve Koltuk Bilgileri");

        panel_yolcuKaydet.setBackground(new java.awt.Color(240, 240, 240));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("İsim :  ");

        jTextField_YolcuIsim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Soyad : ");

        jTextField_YolcuSoyad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Kaydet.setText("Kaydet");
        jButton_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KaydetActionPerformed(evt);
            }
        });

        jTextField_Telefon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Telefon: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cinsiyet : ");

        jComboBox_Cinsiyet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz", "Bay", "Bayan" }));

        javax.swing.GroupLayout panel_yolcuKaydetLayout = new javax.swing.GroupLayout(panel_yolcuKaydet);
        panel_yolcuKaydet.setLayout(panel_yolcuKaydetLayout);
        panel_yolcuKaydetLayout.setHorizontalGroup(
            panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_yolcuKaydetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_yolcuKaydetLayout.createSequentialGroup()
                        .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(panel_yolcuKaydetLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_yolcuKaydetLayout.createSequentialGroup()
                        .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_yolcuKaydetLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_yolcuKaydetLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_Kaydet)
                                    .addComponent(jTextField_YolcuIsim, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_YolcuSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))))
        );
        panel_yolcuKaydetLayout.setVerticalGroup(
            panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_yolcuKaydetLayout.createSequentialGroup()
                .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_YolcuIsim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_YolcuSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_yolcuKaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Kaydet))
        );

        jTextField_YolcuTCNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TC No : ");

        jButton_Devam.setText("Devam");
        jButton_Devam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DevamActionPerformed(evt);
            }
        });

        jButton_Geri.setText("Geri");
        jButton_Geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GeriActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Burak BEYKURT 2013");

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("    burakbeykurt@gmail.com     ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_Devam))
                                    .addComponent(jTextField_YolcuTCNo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(panel_yolcuKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_YolcuTCNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Devam)
                            .addComponent(jButton_Geri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(panel_yolcuKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_DevamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DevamActionPerformed
        try {
            biletKes();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_Bilet_Yolcu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_DevamActionPerformed

    public void biletKes() throws Exception
    {
       String sCurrentLine;
       Boolean kayitVar = false;
       
       jTextField_YolcuIsim.setText("");
       jTextField_YolcuSoyad.setText("");
       
       if( jTextField_YolcuTCNo.getText().equalsIgnoreCase("") )
	   JOptionPane.showMessageDialog(null, "Boş Alan Bırakmamalısınız...","HATA",JOptionPane.PLAIN_MESSAGE);
       else
       {
               BufferedReader bufReaderYolcu = readwrite.dosyaOku(yolcuFile);
               while ((sCurrentLine = bufReaderYolcu.readLine()) != null)
               {
                    String[] parcalar = sCurrentLine.split(" & ");
                    String TCNo = jTextField_YolcuTCNo.getText().trim() ;
                    if(parcalar[2].equalsIgnoreCase(TCNo))
                    {
                          jTextField_YolcuIsim.setText(parcalar[0]);
                          jTextField_YolcuIsim.setEditable(false);
                          jTextField_YolcuSoyad.setText(parcalar[1]);
                          jTextField_YolcuSoyad.setEditable(false);
                          jComboBox_Cinsiyet.setEditable(false);
                          if(parcalar[3].equalsIgnoreCase("Bay"))
                              jComboBox_Cinsiyet.setSelectedIndex(1);
                          else
                              jComboBox_Cinsiyet.setSelectedIndex(2);
                          jTextField_Telefon.setText(parcalar[4]);
                          jTextField_Telefon.setEditable(false);
                          jButton_Kaydet.setVisible(false);
                          panel_yolcuKaydet.setVisible(true);
                          kayitVar = true;
                          tamamlandiMi=true;
                          tumBilgiler = jTextField_YolcuTCNo.getText().trim()+" & "+jTextField_YolcuIsim.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+plaka+" & "+koltukNo;
                    }
               }
               bufReaderYolcu.close();
               if(!kayitVar)
               {
                     JOptionPane.showMessageDialog(null, jTextField_YolcuTCNo.getText()+" TC Numaralı Yolcu Sistemde Kayıtlı Değildir.Lütfen Kayıt Ediniz.","Kayıt Gerekli",JOptionPane.PLAIN_MESSAGE);
                     jTextField_YolcuIsim.setText("");
                     jTextField_YolcuSoyad.setText("");
                     jTextField_Telefon.setText("");
                     jComboBox_Cinsiyet.setSelectedIndex(0);
                     panel_yolcuKaydet.setVisible(true);
                     jButton_Kaydet.setVisible(true);
                     jTextField_YolcuTCNo.setEditable(false);
                     jTextField_YolcuIsim.setEditable(true);
                     jTextField_YolcuSoyad.setEditable(true);
                     jTextField_Telefon.setEditable(true);
                     jComboBox_Cinsiyet.setEditable(true);
                     jButton_Devam.setVisible(false);
                     jButton_Devam.setText("Tamamla");
               }
           
           if(tamamlandiMi)
           {
               
                int reply = JOptionPane.showConfirmDialog(null,"Bilet Kesim İşlemini Onaylıyor Musunuz?","ONAY", JOptionPane.YES_NO_OPTION);
                if(reply == JOptionPane.YES_OPTION)
                {
                    BufferedReader bufReaderBiletler = readwrite.dosyaOku(biletlerFile);
                    String[] biletId = bufReaderBiletler.readLine().split(" & ");
                    String newRecord, newRecord2;
                    int biletID = Integer.parseInt(biletId[1]);
                    biletID++;
                    tumBilgiler = tumBilgiler +" & "+ biletID;
                    bufReaderBiletler.close();
                    
                    BufferedWriter bufWriterTmp = readwrite.dosyaYaz(tmpdosya);
                    BufferedReader bufReaderBiletler2 = readwrite.dosyaOku(biletlerFile);
                    while ((sCurrentLine = bufReaderBiletler2.readLine()) != null)
                    {
                         String[] parcalar = sCurrentLine.split(" & ");

                         if(parcalar[0].equalsIgnoreCase("ID"))
                         {
                             String id =Integer.toString(biletID) ;
                             newRecord ="ID & "+id;
                             sCurrentLine = newRecord;
                         }
                         bufWriterTmp.write(sCurrentLine);
                         bufWriterTmp.newLine();
                     }
                     bufWriterTmp.close();
                     bufReaderBiletler2.close();
                   
                    biletlerFile.delete();
                    tmpdosya.renameTo(biletlerFile);
                    
                    BufferedWriter bufWriterBiletler = readwrite.dosyaYaz(biletlerFile);
                    bufWriterBiletler.write(tumBilgiler);
                    bufWriterBiletler.newLine();
                    bufWriterBiletler.close(); 
                    
                    BufferedWriter bufWriterTmp2 = readwrite.dosyaYaz(tmpdosya);
                    BufferedReader bufReaderKoltukDurumu = readwrite.dosyaOku(koltukDurumuFile);		

                    while ((sCurrentLine = bufReaderKoltukDurumu.readLine()) != null)
                    {
                         String[] parcalar2 = sCurrentLine.split(" & ");

                         if(parcalar2[0].equalsIgnoreCase( plaka ))
                         {
                             newRecord2 = parcalar2[0];
                             parcalar2[koltukNo]="D";

                             for(int i=1; i<=44;i++)
                             {       newRecord2+=" & "+parcalar2[i];       }
                             sCurrentLine = newRecord2;
                         }
                         bufWriterTmp2.write(sCurrentLine);
                         bufWriterTmp2.newLine();
                     }
                     bufWriterTmp2.close();
                     bufReaderKoltukDurumu.close();

                     koltukDurumuFile.delete();
                     tmpdosya.renameTo(koltukDurumuFile);
                     
                     JOptionPane.showMessageDialog(null, "Bilet Kesim İşlemi Tamamlanmıştır...Menüye Aktarılacaksınız","Teşekkürler",JOptionPane.PLAIN_MESSAGE);
                     jTextField_YolcuIsim.setText("");
                     jTextField_YolcuSoyad.setText("");
                     jTextField_YolcuTCNo.setText("");
                     jTextField_Telefon.setText("");
                     jComboBox_Cinsiyet.setSelectedIndex(0);
                     jTextField_YolcuTCNo.setEditable(true);
                     SetVisible.visibleAyarla(BiletUygulamasi.PanelMenu);
                     jButton_Devam.setText("Devam");
                }
                else 
                {
                        jTextField_YolcuIsim.setText("");
                        jTextField_YolcuSoyad.setText("");
                        jTextField_YolcuTCNo.setText("");
                        jTextField_YolcuIsim.setEditable(false);
                        jTextField_YolcuSoyad.setEditable(false);
                        jTextField_Telefon.setEditable(false);
                        jTextField_Telefon.setText("");
                        jComboBox_Cinsiyet.setEditable(false);
                        jComboBox_Cinsiyet.setSelectedIndex(0);
                        jTextField_YolcuTCNo.setEditable(true);
                        tamamlandiMi=false;
                        jButton_Devam.setText("Devam");
                        JOptionPane.showMessageDialog(null, "Bilet Kesim İşlemini İptal Ettiniz.Tüm Bilgiler Sıfırlandı","Uyarı",JOptionPane.PLAIN_MESSAGE);
               } 
           }
        }
    }
    private void jButton_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GeriActionPerformed
       SetVisible.visibleAyarla(BiletUygulamasi.acikOlanPanel);
       
    }//GEN-LAST:event_jButton_GeriActionPerformed

    private void jButton_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KaydetActionPerformed
        try {
            yolcuKaydet();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_Bilet_Yolcu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_KaydetActionPerformed
    public void yolcuKaydet() throws Exception
    {
        if( jTextField_YolcuTCNo.getText().equalsIgnoreCase("") || jTextField_YolcuIsim.getText().equalsIgnoreCase("") ||jTextField_YolcuSoyad.getText().equalsIgnoreCase(""))
		JOptionPane.showMessageDialog(null, "Boş Alan Bırakmamalısınız...","HATA",JOptionPane.PLAIN_MESSAGE);
	else if(jComboBox_Cinsiyet.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(null, "Cinsiyet Seçiniz...","HATA",JOptionPane.PLAIN_MESSAGE);	
	else
	{	
            BufferedWriter bufWriterYolcu = readwrite.dosyaYaz(yolcuFile);
            if(jTextField_Telefon.getText().equalsIgnoreCase(""))
                {
                    if(jComboBox_Cinsiyet.getSelectedIndex()==1)
                        tumBilgiler = jTextField_YolcuIsim.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_YolcuTCNo.getText().trim()+" & Bay"+" & null";
                    else
                        tumBilgiler = jTextField_YolcuIsim.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_YolcuTCNo.getText().trim()+" & Bayan"+" & null";
                }
                else
                {
                    if(jComboBox_Cinsiyet.getSelectedIndex()==1)
                        tumBilgiler = jTextField_YolcuIsim.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_YolcuTCNo.getText().trim()+" & Bay & "+jTextField_Telefon.getText();
                    else
                        tumBilgiler = jTextField_YolcuIsim.getText().trim()+" & "+jTextField_YolcuSoyad.getText().trim()+" & "+jTextField_YolcuTCNo.getText().trim()+" & Bayan & "+jTextField_Telefon.getText();
                }
            int reply = JOptionPane.showConfirmDialog(null,"Yolcu Kayıt İşlemini Onaylıyor Musunuz?","ONAY", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION)
            {
                bufWriterYolcu.write(tumBilgiler);
                bufWriterYolcu.newLine();
                JOptionPane.showMessageDialog(null, "Tüm Bilgiler Eklendi.Şimdi Bilet Kesim İşlemine Devam Edebilirsiniz.","Teşekkürler",JOptionPane.PLAIN_MESSAGE);
                jButton_Kaydet.setVisible(false);
                jButton_Devam.setVisible(false);
                jButton_Devam.setVisible(true);
                jTextField_YolcuIsim.setEditable(false);
                jTextField_YolcuSoyad.setEditable(false);
                jTextField_Telefon.setEditable(false);
                jComboBox_Cinsiyet.setEditable(false);
                tamamlandiMi=true;
                jButton_Devam.setText("Tamamla");
            }
            bufWriterYolcu.close();
            
	}
    }
          
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Devam;
    private javax.swing.JButton jButton_Geri;
    private javax.swing.JButton jButton_Kaydet;
    private javax.swing.JComboBox jComboBox_Cinsiyet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_Telefon;
    private javax.swing.JTextField jTextField_YolcuIsim;
    private javax.swing.JTextField jTextField_YolcuSoyad;
    private javax.swing.JTextField jTextField_YolcuTCNo;
    private java.awt.Panel panel_yolcuKaydet;
    // End of variables declaration//GEN-END:variables
}