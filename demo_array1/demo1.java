/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_array1;

/**
 *
 * @author eperez50
 */
public class demo1 {
    
    
    public void sintaxis() {

        System.out.println("------------------------------------");
        
        int[] areje1 = new int[5];
        
        int areje2[] = new int[5];
        
        int[] areje3 = {10,20,30,40,50};
        
        System.out.println("areje3:");
        mostrarVector(areje3);
        
        int largo = areje3.length;
        
        System.out.println("areje1 (antes):");
        mostrarVector(areje1);

        for (int x=0; x<largo; x++) {
            int valor = areje3[x];
            areje1[x] = valor;
        }
     
        System.out.println("areje1 (despues):");
        mostrarVector(areje1);

    }
    
    public void mostrarVector (int datos[]) { 
        int i; 
        for (i=0; i<datos.length; i++) {
            System.out.println(datos[i]); 
        } 
    }    
}
