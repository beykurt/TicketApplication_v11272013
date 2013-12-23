/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biletuygulamasi;

import static biletuygulamasi.BiletUygulamasi.BiletKes;
import static biletuygulamasi.BiletUygulamasi.PanelHosgeldiniz;
import static biletuygulamasi.BiletUygulamasi.PanelMenu;
import static biletuygulamasi.BiletUygulamasi.Bilet_Yolcu;
import static biletuygulamasi.BiletUygulamasi.BiletKes;
import static biletuygulamasi.BiletUygulamasi.Bilet_Iptal;
import static biletuygulamasi.BiletUygulamasi.Yolcu_Ekle;
import static biletuygulamasi.BiletUygulamasi.Yolcu_Duzenle;
import javax.swing.JPanel;

/**
 *
 * @author Burak BEYKURT
 */
public class SetVisible 
{
    static void visibleAyarla(JPanel internalPanel) {
        PanelHosgeldiniz .setVisible(false);
        PanelMenu .setVisible(false);
        BiletKes.setVisible(false);
        Bilet_Yolcu.setVisible(false);
        BiletKes.setVisible(false);
        Bilet_Iptal.setVisible(false);
        Yolcu_Ekle.setVisible(false);  
        Yolcu_Duzenle.setVisible(false);    
        internalPanel.setVisible(true); 
    }
    
}
