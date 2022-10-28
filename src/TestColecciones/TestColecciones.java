
package TestColecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TestColecciones {
     public static void main(String [] args){
         
     List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);
        
         
         System.out.println("");
        Set <String> miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        imprimirx(miSet);
        
         System.out.println("");
        Map <String, String> miMap = new HashMap<>();
        miMap.put("valor1", "Angie");
        miMap.put("valor2", "Abner");
        miMap.put("valor3", "Angel");
       
        String elem = miMap.get("valor1");
         System.out.println("Elemento 1 = "+elem);
         
         imprimirx(miMap.keySet());
         System.out.println("");
         imprimirx(miMap.values());
    }
     
      public static void imprimirx(Collection <String> coleccion) {
        coleccion.forEach(elemen -> {
            System.out.println("Elemento = "+elemen);
        });
    }
     
}
