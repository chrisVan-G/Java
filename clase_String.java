
public class clase_String {

	public static void main(String[] args) {
		// Manipulación de cadenas de caracteres
		
		String nombre = "Camilo";
		System.out.println("* Bienvenido " + nombre);
		System.out.println("* El nombre tiene " + nombre.length() + " letras"); //Longitud de la cadena de caracteres
		System.out.println("* La primer letra de " + nombre + " es la " + nombre.charAt(0)); //Primer letra de la cadena de caracteres
		
		int ultimaLetra;
		ultimaLetra = nombre.length(); //Extraer la última letra de una cadena de texto
		System.out.println("* La última letra de " + nombre + " es la " + nombre.charAt(ultimaLetra-1));
		
		String frase = "Hoy es un hermoso día para salir con mi chica";
		String frase_resumen = frase.substring(0,26) + " salir a caminar en el bosque"; //Extrar los caracteres que necesito
		System.out.println("* " + frase_resumen);
		
		String persona_1, persona_2;
		persona_1 = "Juan";
		persona_2 = "juan";
		System.out.println("* La persona uno es igual a la persona dos: " + persona_1.equals(persona_2));
		System.out.println("* La persona uno es igual a la persona dos: " + persona_1.equalsIgnoreCase(persona_2));
		//IgnoreCase compara sin tener en cuenta mayúsculas ni minúsculas
		
	}

}
