/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biletuygulamasi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Burak BEYKURT
 */
public class DosyaOkuYaz 
{
    private BufferedReader bufReader;
    private BufferedWriter bufWriter;
    
    public BufferedWriter dosyaYaz(File file) throws IOException
    {
        try
        {
            OutputStream yaz = new FileOutputStream(file,true);
            OutputStreamWriter out = new OutputStreamWriter(yaz,"Cp1254");
            bufWriter = new BufferedWriter(out);
        }catch(Exception hata){}
        return bufWriter;
    }
    public BufferedReader dosyaOku(File file)
    {
        try
        {
            InputStream oku = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(oku, "Cp1254");
            bufReader = new BufferedReader(isr);
        }catch(Exception hata){}
        return bufReader;
    }
}
