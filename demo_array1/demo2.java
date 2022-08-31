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
public class demo2 {
    
    public void sintaxis() {
        
        System.out.println("------------------------------------");
        
        String[] array_A = new String[5];
        
        array_A[0] = convertirNumeroATexto(21);
        array_A[1] = convertirNumeroATexto(32);
        array_A[2] = convertirNumeroATexto(43);
        array_A[3] = convertirNumeroATexto(54);
        array_A[4] = convertirNumeroATexto(65);
        
        mostrarVector(array_A);
        
    }
    
     public static String convertirNumeroATexto(int numero) {
        String unidades[] = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
                "siete", "ocho", "nueve"};

        String especiales[] = new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis",
                "diecisiete", "dieciocho", "diecinueve"};

        String decenas[] = new String[]{ "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
                "setenta", "ochenta", "noventa"};

        if (numero < 10) {
            return unidades[numero];
        }
        if (numero < 20) {
            return especiales[numero - 10];
        }
        if (numero < 100 && numero % 10 == 0) {
            int index = (numero / 10) - 2;
            return decenas[index];
        }

        if(numero<100){
            int dIndex = (numero/10)-2;
            int uIndex = (numero%10);
            return decenas[dIndex] + " y " + unidades[uIndex];
        }
        //si retorna null es porque el numero  no es valido
        return null;
    }

    public void mostrarVector (String datos[]) { 
        int i; 
        for (i=0; i<datos.length; i++) {
            System.out.println(datos[i]); 
        } 
    }    

}
