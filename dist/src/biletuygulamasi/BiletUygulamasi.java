
package biletuygulamasi;

import javax.swing.JPanel;

public class BiletUygulamasi extends javax.swing.JFrame 
{
    public static JPanel_Hosgeldiniz PanelHosgeldiniz = new JPanel_Hosgeldiniz();
    public static JPanel_Menu PanelMenu = new JPanel_Menu();
    public static JPanel_BiletKes BiletKes = new JPanel_BiletKes();
    public static JPanel_Bilet_Yolcu Bilet_Yolcu = new JPanel_Bilet_Yolcu();
    public static JPanel_BiletIptal Bilet_Iptal = new JPanel_BiletIptal();
    public static JPanel_YolcuEkle Yolcu_Ekle = new JPanel_YolcuEkle();
    public static JPanel_YolcuDuzenle Yolcu_Duzenle = new JPanel_YolcuDuzenle();
    public static JPanel_YolcuSil Yolcu_Sil = new JPanel_YolcuSil();
    public static JPanel acikOlanPanel;
    
    public BiletUygulamasi() {
       initComponents();
       acikOlanPanel =  PanelHosgeldiniz;
       //------------------------------------------------------
       PanelHosgeldiniz.setVisible(true);
       PanelHosgeldiniz.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(PanelHosgeldiniz, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------
       PanelMenu.setVisible(false);
       PanelMenu.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(PanelMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
       //------------------------------------------------------
       BiletKes.setVisible(false);
       BiletKes.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(BiletKes, javax.swing.JLayeredPane.DEFAULT_LAYER);
       
       //------------------------------------------------------
       Bilet_Yolcu.setVisible(false);
       Bilet_Yolcu.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(Bilet_Yolcu, javax.swing.JLayeredPane.DEFAULT_LAYER);
       
       //------------------------------------------------------
       Bilet_Iptal.setVisible(false);
       Bilet_Iptal.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(Bilet_Iptal, javax.swing.JLayeredPane.DEFAULT_LAYER);
       
       //------------------------------------------------------
       Yolcu_Ekle.setVisible(false);
       Yolcu_Ekle.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(Yolcu_Ekle, javax.swing.JLayeredPane.DEFAULT_LAYER);
       
       //------------------------------------------------------
       Yolcu_Duzenle.setVisible(false);
       Yolcu_Duzenle.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(Yolcu_Duzenle, javax.swing.JLayeredPane.DEFAULT_LAYER);
       
       //------------------------------------------------------
       Yolcu_Sil.setVisible(false);
       Yolcu_Sil.setBounds(0, 0, 650, 450);
       jDesktopPane1.add(Yolcu_Sil, javax.swing.JLayeredPane.DEFAULT_LAYER);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bilet Kesim ve Yolcu Takip Programı");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1500, 500));
        setResizable(false);

        jDesktopPane1.setAlignmentX(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BiletUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiletUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiletUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiletUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiletUygulamasi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
