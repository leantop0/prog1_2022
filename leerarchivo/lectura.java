/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class lectura {
    
    public void demo_file() {
        
        System.out.println("--------- demo_file ----------");
        
        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        try {
            // archivo = new File("archivo33.txt");
            // archivo = new File("C:/Users/eperez50/Documents/NetBeansProjects/maeria_prog1/archivo33.txt");            
            archivo = new File("C:/temporal/archivo33.txt");            
            reader = new FileReader(archivo);
            buffer = new BufferedReader(reader);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
            }
        } 
        
        catch (Exception e) {
             e.printStackTrace();
             // System.out.println("Archivo NO encontrado. Verifique!");
        } 
        
        finally {
            try {
                if (null != reader) {
                    reader.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        
    }
    
    
    public void demo_Reader() {
        
        try {
            
            System.out.println("--------- demo_Reader ----------");
            
            File archivo = null;
            archivo = new File("C:/temporal/archivo33.txt");            
            Scanner fin = new Scanner(archivo);
            String line;
            
            while ((line = fin.nextLine()) != null) {
                System.out.println(line);
            }
            
        }
        
        catch (FileNotFoundException e) {
             // e.printStackTrace();
             System.out.println("Error en lectura. Verifique!");
        } 
        
    }
    
    public void demo_Reader2() {
        
        try {

            System.out.println("--------- demo_Reader2 ----------");
            
            File archivo = null;
            archivo = new File("C:/temporal/archivo33.txt");            
            Scanner fin = new Scanner(archivo);
            String line;
            
            while (fin.hasNext()) {
                line = fin.nextLine();
                System.out.println(line);
            }
            
        }
        
        catch (FileNotFoundException e) {
             e.printStackTrace();
             // System.out.println("Archivo NO encontrado. Verifique!");
        } 
        
    }


}
