/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion_usuario;

import java.util.ArrayList;

/**
 *
 * @author eperez50
 */
public class excep_ususario {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // System.out.println("================================================");
        // Cajero cajero = new Cajero();
        // cajero.operaciones();
        
        System.out.println("================================================");
        Cajero_seguro cajero_seguro = new Cajero_seguro();
        cajero_seguro.operaciones();

    }
    
    
}
