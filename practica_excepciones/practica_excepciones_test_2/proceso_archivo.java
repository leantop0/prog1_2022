/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_excepciones_test_2;

import practica_excepciones_test.*;
import practica_excepciones.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

/**
 *
 * @author eperez50
 */
public class proceso_archivo {
    
    private String fnombre = "c:/temporal/registros.txt";
    private String fsalida = "c:/temporal/registros_resultado.txt";
    
    public void proceso() throws Exception {
        
        File archivo = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        String linea="";
        String mensaje="";
        
        archivo = new File(fnombre);            
        reader = new FileReader(archivo);
        buffer = new BufferedReader(reader);
        while ((linea = buffer.readLine()) != null) {
            // System.out.println(linea);
            // int entero = Integer.parseInt(linea);
            // long lon = Long.parseLong(linea);
            
                try {
                    double dou = Double.parseDouble(linea);
                    mensaje = mensaje.concat(linea).concat(": es un numero").concat("\n");
                }
                catch (NumberFormatException e) {
                    mensaje = mensaje.concat(linea).concat(": No es un numero").concat("\n");
                }
        }
        salida_proceso(mensaje);
    }
    
    
    public void salida_proceso(String mensaje)  throws Exception {
        // TODO
        File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        fichero = new File(fsalida);
        writer = new FileWriter(fichero);
        pw = new PrintWriter(writer);
        pw.println(mensaje);
        writer.close();
        
    }
    
}
