/*
	import java.util.ArrayList;
	import java.util.Scanner;

	// Clase para representar un ingreso
	class Ingreso {
	    private double cantidad;
	    private String descripcion;

	    public Ingreso(double cantidad, String descripcion) {
	        this.cantidad = cantidad;
	        this.descripcion = descripcion;
	    }

	    public double getCantidad() {
	        return cantidad;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }
	}

	// Clase para representar un egreso
	class Egreso {
	    private double cantidad;
	    private String descripcion;

	    public Egreso(double cantidad, String descripcion) {
	        this.cantidad = cantidad;
	        this.descripcion = descripcion;
	    }

	    public double getCantidad() {
	        return cantidad;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }
	}

	// Clase principal para gestionar el salario
	public class GestionSalario {
	    private double saldo;
	    private ArrayList<Ingreso> ingresos;
	    private ArrayList<Egreso> egresos;

	    public GestionSalario() {
	        saldo = 0.0;
	        ingresos = new ArrayList<>();
	        egresos = new ArrayList<>();
	    }
	    
	    public void agregarIngreso(double cantidad, String descripcion) {
	        ingresos.add(new Ingreso(cantidad, descripcion));
	        saldo += cantidad;
	    }

	    public void agregarEgreso(double cantidad, String descripcion) {
	        egresos.add(new Egreso(cantidad, descripcion));
	        saldo -= cantidad;
	    }

	    public void mostrarSaldo() {
	        System.out.println("Saldo actual: " + saldo);
	    }

	    public void mostrarIngresos() {
	        System.out.println("Ingresos:");
	        for (Ingreso ingreso : ingresos) {
	            System.out.println("- " + ingreso.getDescripcion() + ": $" + ingreso.getCantidad());
	        }
	    }

	    public void mostrarEgresos() {
	        System.out.println("Egresos:");
	        for (Egreso egreso : egresos) {
	            System.out.println("- " + egreso.getDescripcion() + ": $" + egreso.getCantidad());
	        }
	    }

	    public static void main(String[] args) {
	        GestionSalario gestionSalario = new GestionSalario();
	        Scanner scanner = new Scanner(System.in);
	        char opcion;

	        do {
	            System.out.println("Seleccione una opción:");
	            System.out.println("1. Agregar ingreso");
	            System.out.println("2. Agregar egreso");
	            System.out.println("3. Mostrar saldo");
	            System.out.println("4. Mostrar ingresos");
	            System.out.println("5. Mostrar egresos");
	            System.out.println("6. Salir");
	            opcion = scanner.next().charAt(0);

	            switch (opcion) {
	                case '1':
	                    System.out.println("Ingrese la cantidad del ingreso:");
	                    double cantidadIngreso = scanner.nextDouble();
	                    System.out.println("Ingrese la descripción del ingreso:");
	                    String descripcionIngreso = scanner.next();
	                    gestionSalario.agregarIngreso(cantidadIngreso, descripcionIngreso);
	                    break;
	                case '2':
	                    System.out.println("Ingrese la cantidad del egreso:");
	                    double cantidadEgreso = scanner.nextDouble();
	                    System.out.println("Ingrese la descripción del egreso:");
	                    String descripcionEgreso = scanner.next();
	                    gestionSalario.agregarEgreso(cantidadEgreso, descripcionEgreso);
	                    break;
	                case '3':
	                    gestionSalario.mostrarSaldo();
	                    break;
	                case '4':
	                    gestionSalario.mostrarIngresos();
	                    break;
	                case '5':
	                    gestionSalario.mostrarEgresos();
	                    break;
	                case '6':
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
	            }
	        } while (opcion != '6');
	    }
	}
*/
