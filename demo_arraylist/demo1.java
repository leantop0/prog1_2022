package demo_arraylist;

import java.util.*;

public class demo1 {

    public void corre_demo() {
        
        /* Creando una ArrayList de tipo "String" lo que significa que * sólo podemos añadir elementos "String" */ 
        ArrayList<String> obj = new ArrayList<String>();
        /* Así es como añadimos elementos a una ArrayList*/ 
        
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj"); 

        // Mostrar elementos 
        System.out.println("");  
        System.out.println("Lista De Arreglo Original:");  
        for (String str : obj) {
            System.out.println(str);
        }
        
        /* 
        - Añadir elemento en el índice dado   obj.add(0, "Rahul") 
        - Añadir elemento "Rahul" en la primera posición * obj.add(1, "Justin") 
        - Añadir el elemento "Justin" en la segunda posición 
        */
        
        obj.add(0, "Rahul");
        obj.add(1, "Justin"); 

        // Mostrar elementos
        System.out.println("");  
        System.out.println("ArrayList después de añadir la operación:");
        for (String str : obj) {
            System.out.println(str); 
        }
        
        
        //Quitar elemento del índice especificado 
        obj.remove(1); 
        //Elimina el segundo elemento de la lista 
        obj.remove(2); 

        // Mostrar elementos 
        System.out.println("");  
        System.out.println("ArrayList después de la operación de eliminación:");
        for (String str : obj) {
            System.out.println(str); 
        }        
        
        // Mostrando los elementos 
        
        System.out.println("");  
        System.out.println("Final ArrayList:");
        for (String str : obj) {
            System.out.println(str);
        }
    }
}
    