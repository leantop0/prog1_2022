/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_excepciones_test_2;

import practica_excepciones_test.*;
import practica_excepciones.*;

/**
 *
 * @author eperez50
 */
public class Practica_excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            proceso_archivo proc_arch = new proceso_archivo();
            proc_arch.proceso();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
