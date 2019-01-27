/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flathunter;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import org.jsoup.parser;

/**
 * 
 * @author tylnesh
 */
public class FlatHunter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //if (args.length != 0) System.out.print(args[0] + '\n');  
        //else System.out.print("Hello World!\n");
        
        //search string is based upon 
        //https://reality.bazos.sk/prenajmu/byt/?hledat=&rubriky=reality&hlokalita=91105&humkreis=10&cenaod=350&cenado=430&Submit=H%C4%BEada%C5%A5&kitx=ano
        if (args.length == 4)
         {
         String location = args[0];
         String distance = args[1];
         String priceMin = args[2];
         String priceMax = args[3];
         String httpsURL = "https://reality.bazos.sk/prenajmu/byt/10/?hledat=&rubriky=reality&hlokalita="+location+"&humkreis="+distance+"&cenaod="+priceMin+"&cenado="+priceMax;
         String htmlFile = "/tmp/tempFile.html";
        
         //getHtml(httpsURL, htmlFile);
         if (getHtml(httpsURL, htmlFile)> 0) {
             
         
         }
        
         }
    }
    
    public static int getHtml(String address, String file) throws IOException
    {
        int lines = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        URL myurl = new URL(address);
        HttpsURLConnection con = (HttpsURLConnection) myurl.openConnection();
        con.setRequestProperty ( "User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:64.0) Gecko/20100101 Firefox/64.00" );
        InputStream ins = con.getInputStream();
        InputStreamReader isr = new InputStreamReader(ins, "UTF-8");
        BufferedReader in = new BufferedReader(isr);
        String inputLine;

        // Write each line into the file
        while ((inputLine = in.readLine()) != null) {
            //System.out.println(inputLine);
            lines++;
            bw.write(inputLine);
        }
        in.close(); 
        bw.close();
        return lines;
    }
    
}
