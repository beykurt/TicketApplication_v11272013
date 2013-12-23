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



public class JPanel_YolcuEkle extends javax.swing.JPanel {

    DosyaOkuYaz readwrite = new DosyaOkuYaz();
    static File yolcuFile = new File("src/db/yolcu.txt");
    private BufferedWriter bufWriter;
    private BufferedReader bufReader;
    private String tumBilgiler;
    private boolean kayitVarMi=false;
    
    public JPanel_YolcuEkle() 
    {
        initComponents();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_YolcuTCNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_Geri = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_YolcuIsim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_YolcuSoyad = new javax.swing.JTextField();
        jButton_Kaydet = new javax.swing.JButton();
        jTextField_Telefon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox_Cinsiyet = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jButton_Temizle = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 429));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Yolcu Ekleme Paneli");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biletuygulamasi/images/ticket2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Yolcu Bilgilerini Doldurunuz");

        jTextField_YolcuTCNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TC No  (*) : ");

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

        jTextField_YolcuIsim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("İsim (*) :  ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Soyad (*) : ");

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

        jLabel11.setText("Yıldızlı Alanları Doldurulmak Zorundadır.");

        jComboBox_Cinsiyet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz", "Bay", "Bayan" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cinsiyet (*) : ");

        jButton_Temizle.setText("Temizle");
        jButton_Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TemizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_YolcuIsim, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_YolcuTCNo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_YolcuSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton_Geri, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_YolcuTCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField_YolcuIsim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_YolcuSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Geri)
                    .addComponent(jButton_Kaydet)
                    .addComponent(jButton_Temizle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void yolcuEkle() throws Exception
    {
       if( jTextField_YolcuTCNo.getText().equalsIgnoreCase("") || jTextField_YolcuIsim.getText().equalsIgnoreCase("") ||jTextField_YolcuSoyad.getText().equalsIgnoreCase(""))
           JOptionPane.showMessageDialog(null, "Boş Alan Bırakmamalısınız...","HATA",JOptionPane.PLAIN_MESSAGE);
       else if(jComboBox_Cinsiyet.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(null, "Cinsiyet Seçiniz...","HATA",JOptionPane.PLAIN_MESSAGE);
       else
       {    
           String sCurrentLine;
           BufferedReader bufReaderYolcu = readwrite.dosyaOku(yolcuFile);
           while ((sCurrentLine = bufReaderYolcu.readLine()) != null)
           {
                    String[] parcalar = sCurrentLine.split(" & ");
                    if(parcalar[2].equalsIgnoreCase(jTextField_YolcuTCNo.getText().trim()))
                    {
                        JOptionPane.showMessageDialog(null, jTextField_YolcuTCNo.getText()+" TC No'lu Kişi Sistemde Kayıtlıdır.","HATA",JOptionPane.PLAIN_MESSAGE);
                        kayitVarMi=true;
                    }
           }
           bufReaderYolcu.close();
           if(!kayitVarMi)
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
                     JOptionPane.showMessageDialog(null, "Tüm Bilgiler Eklendi.","Teşekkürler",JOptionPane.PLAIN_MESSAGE);
                     jTextField_YolcuTCNo.setText("");
                     jTextField_YolcuIsim.setText("");
                     jTextField_YolcuSoyad.setText("");
                     jTextField_Telefon.setText("");
                     jComboBox_Cinsiyet.setSelectedIndex(0);
                     kayitVarMi=false;
                }
                bufWriterYolcu.close();
           }
         }    
     }
    private void jButton_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KaydetActionPerformed
        try {
            yolcuEkle();
        } catch (Exception ex) {
            Logger.getLogger(JPanel_YolcuEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_KaydetActionPerformed

    private void jButton_GeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GeriActionPerformed
       SetVisible.visibleAyarla(BiletUygulamasi.PanelMenu);
       jTextField_YolcuTCNo.setText("");
       jTextField_YolcuIsim.setText("");
       jTextField_YolcuSoyad.setText("");
       jTextField_Telefon.setText("");
       jComboBox_Cinsiyet.setSelectedIndex(0);
       kayitVarMi=false;
    }//GEN-LAST:event_jButton_GeriActionPerformed

    private void jButton_TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TemizleActionPerformed
        jTextField_YolcuTCNo.setText("");
        jTextField_YolcuIsim.setText("");
        jTextField_YolcuSoyad.setText("");
        jTextField_Telefon.setText("");
        jComboBox_Cinsiyet.setSelectedIndex(0);
        kayitVarMi=false;
    }//GEN-LAST:event_jButton_TemizleActionPerformed
   
 

          
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Geri;
    private javax.swing.JButton jButton_Kaydet;
    private javax.swing.JButton jButton_Temizle;
    private javax.swing.JComboBox jComboBox_Cinsiyet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    // End of variables declaration//GEN-END:variables
}
