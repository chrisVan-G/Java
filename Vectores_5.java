
public class Vectores_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desarrollar un programa que, mediante el uso de dos vectores, permita almacenar las 5 notas de un estudiante para calcular su
		 * promedio final, los valores para calcular el promedio se encuentran en un vector a parte que contiene los porcentajes asignados a cada nota.
		 */
		
		double[] notas = new double[5];
		int[] porcentajes = {20, 10, 30, 20, 20};
		
		notas[0] = 4.5;
		notas[1] = 3.2;
		notas[2] = 5.0;
		notas[3] = 1.5;
		notas[4] = 4.3;
		
		double promedio = 0;
		
		for(int i = 0; i < notas.length; i++) {
			promedio = (notas[i] * (porcentajes[i]) / 100) + promedio; 
		}
		
		System.out.println("Promedio final " + Math.round(promedio));
	}

}
