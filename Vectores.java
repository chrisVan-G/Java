
import java.util.ArrayList;

public class Vectores {
    public static void main(String[] args) {
    	
    	// También se conocen como arrays o matrices cuando trabajan con 2 dimensiones
    	
        // Crear un ArrayList para almacenar enteros
        
    	ArrayList<Integer> vector = new ArrayList<>();

        // Agregar elementos al vector
    	
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);
        vector.add(90);
        vector.add(100);
        vector.add(110);
        vector.add(120);
        vector.add(130);
        vector.add(140);
        vector.add(150);
        vector.add(160);
        
        // Acceder a elementos del vector
        
        System.out.println("Elemento en la posicion 0: " + vector.get(0));

        // Modificar un elemento del vector
        
        vector.set(15, 161); // Cambiamos el segundo elemento
        System.out.println("Elemento en la posicion 15: " + vector.get(15));
        
        // Recorrer el vector e imprimir los elementos
        
        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " | ");
        }

        // Obtener el tamaño del vector
        
        System.out.println();
        System.out.println("Tamanio del vector: " + vector.size());

        // Verificar si el vector contiene un elemento específico

        System.out.println("Contiene 30? - " + vector.contains(30));
        
        // Eliminar un elemento del vector
        
        vector.remove(15); // Eliminamos el primer elemento
        
        // Recorrer el vector después de eliminar un elemento
        
        System.out.println("Elementos del vector despues de eliminar determinado elemento:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " | ");
        }
        
        System.out.println();
        
        // Limpiar el vector (eliminar todos los elementos)
        
        vector.clear();
        
        // Verificar si el vector está vacío
        
        System.out.println("El vector esta vacio? - " + vector.isEmpty());
        
        // 	Verificar que el vector está vacío
        
        //vector.add(16);
        
        System.out.println("Elementos del vector despues de vaciarlo:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " | ");
        }
        
        if (vector.size() == 0) {
        	System.out.println("El vector no contiene elementos para mostrar");
    
        }
    }
}
