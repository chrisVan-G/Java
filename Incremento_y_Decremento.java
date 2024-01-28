
public class Incremento_y_Decremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----");
		int a = 5;
		int b = ++a; // Se incrementa el valor y luego utiliza la variable
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----");
		
		int c = 5, d = c++; // Utiliza la variable y luego incrementa el valor
		System.out.println(c);
		System.out.println(d);
		System.out.println("-----");
		
		int f = 5;
		int g = --f; // Se decrementa el valor y luego utiliza la variable
		System.out.println(f);
		System.out.println(g);
		System.out.println("-----");
		
		int h = 5, i = h--; // Utiliza la variable y luego decrementa el valor
		System.out.println(h);
		System.out.println(i);
		System.out.println("-----");
		
	}

}
