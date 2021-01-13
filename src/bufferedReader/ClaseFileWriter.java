/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Sarahi
 */
public class ClaseFileWriter {
    /**
     * 
     * @param args Actividades 4 y 5 escritura y lectura de texto 
     */
    public static void main(String[] args) {
        System.out.println("4********************");
        System.out.println("FileWriter");
        String texto = "";
        BufferedReader br;
        
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribir texto: ");
            texto = br.readLine();
            System.out.println(texto);
            
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println(texto);
            salida.println("Segunda linea");
            salida.close();
    }catch(IOException ioe){}        
    System.out.println("5********************");
    System.out.println("FileReader");
    
    try{
        FileReader fr = new FileReader("fw.txt");
        br = new BufferedReader(fr);
        System.out.println("El contenido del archivo es:");
        String linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();
    }catch(IOException ioe){}
    
    }
}
