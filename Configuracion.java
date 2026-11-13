import java.util.Scanner;

public class Configuracion {
	static Scanner sc = new Scanner(System.in);
	static int numeroPruebas = 1;
	static int vocalesGeneradas = 4;
	static int consonantesGeneradas = 4;
	static int letrasGeneradas = 10;
	static int cantidadOperaciones = 5;

	static public void mostrarMenu() {
		System.out.println("Bienvenido a la configuración");
		System.out.println("Escoga que quiere configurar:");
		System.out.println("A. Número de pruebas que se jugarán en el modo concurso");
		System.out.println("B. Número de vocales generadas en la prueba Palabra Más Larga");
		System.out.println("C. Número de consonantes generadas en la prueba Palabra Más Larga");
		System.out.println("D. Número de letras totales generadas en la prueba Palabra Más Larga");
		System.out.println("E. Número de operaciones realizadas en la prueba Calculadora Humana");
		System.out.println("F. Volver al menú principal");
	}

	static public void opcionPruebas() {
		int pruebasNuevas = 5;
		do {
			System.out.println("¿Cuántas veces quieres que se juegen las pruebas en el modo concurso?");
			System.out.println("Actualmente se jugarán " + numeroPruebas + " pruebas");
			System.out.println("El número de veces que se jugarán las pruebas debe ser 1 o mayor");
			pruebasNuevas = sc.nextInt();
		} while (pruebasNuevas >= 1);
		numeroPruebas = pruebasNuevas;
	}

	static public void opcionVocales() {

		int vocalesNuevas = 4;
		do {
			System.out.println("¿Cuántas vocales quieres que sean generadas en la prueba Palabra Más Larga?");
			System.out.println("Actualmente se generarán " + vocalesGeneradas + " vocales");
			System.out.println("El número de vocales generadas debe ser 4 o mayor");
			vocalesNuevas = sc.nextInt();
		} while (vocalesNuevas >= 4);
		vocalesGeneradas = vocalesNuevas;
	}

	static public void opcionConsonantes() {
		int consonantesNuevas = 4;
		do {
			System.out
					.println("¿Cuántas consonantes quieres que sean generadas en la prueba Palabra Más Larga?");
			System.out.println("Actualmente se generarán " + consonantesGeneradas + " consonantes");
			System.out.println("El número de consonantes generadas debe ser 4 o mayor");
			consonantesNuevas = sc.nextInt();
		} while (consonantesNuevas >= 4);
		consonantesGeneradas = consonantesNuevas;
	}

	static public void opcionLetras() {
		int letrasNuevas = 10;
		do {
			System.out.println("¿Cuántas letras en total quieres que sean generadas en la prueba Palabra Más Larga?");
			System.out.println("Actualmente se generarán " + letrasGeneradas + " letras en total");
			System.out.println(
					"El número de letras generadas en total debe ser mayor que el total de vocales y consonantes configurados");
			System.out.println("Actualmente se generarán " + vocalesGeneradas + " vocales y " + consonantesGeneradas
					+ " consonantes y el total es " + vocalesGeneradas + consonantesGeneradas);
		} while (letrasNuevas > vocalesGeneradas + consonantesGeneradas);
		letrasGeneradas = letrasNuevas;
	}

	static public void opcionOperaciones() {
		int cantidadOperacionesNuevas = 5;
		do {
			System.out.println("¿Cuántas operaciones quieres que se realizen en la prueba Calculadora Humana?");
			System.out.println("Actualmente se realizarán " + cantidadOperaciones + " operaciones");
			System.out.println("El número de operaciones a realizar debe ser 1 o mayor");
			cantidadOperacionesNuevas = sc.nextInt();
		} while (cantidadOperacionesNuevas > 5);
		cantidadOperaciones = cantidadOperacionesNuevas;
	}

	static public boolean realizarOpciones(char c) {
		boolean salir = false;
		switch (c) {
			case 'a':
				opcionPruebas();
				break;
			case 'b':
				opcionVocales();
				break;
			case 'c':
				opcionConsonantes();
				break;
			case 'd':
				opcionLetras();
				break;
			case 'e':
				opcionOperaciones();
				break;
			case 'f':
				salir = true;
				break;
			default:
				System.out.println("Opción no válida introducida");
		}
		return salir;
	}

	static public void configuracion() {
		String opcion = "";
		boolean salir = false;
		do {
			mostrarMenu();
			opcion = sc.next();
			opcion = opcion.toLowerCase();
			salir = realizarOpciones(opcion.charAt(0));
		} while (!salir);
	}
}
