import java.util.Scanner;

public class ModoRapido {
	static Scanner sc = new Scanner(System.in);

	static public void mostrarMenu() {
		System.out.println("Bienvenido al Modo Rápido");
		System.out.println("Escoga la prueba que quiera jugar:");
		System.out.println("A. Cifra Exacta");
		System.out.println("B. Calculadora Humana");
		System.out.println("C. Palabra Más Larga");
		System.out.println("D. Prueba Original");

	}

	static public void modoRapido() {
		System.out.println("Modo Rápido");
		boolean flag = true;
		while (flag) {
			mostrarMenu();
			String option = sc.nextLine();
			option = option.toUpperCase();
			if (option.length() == 1) {
				switch (option.charAt(0)) {
					case 'A':
						System.out.println("Cifra Exacta");
						CifraExacta.cifraExacta();
						flag = false;
						break;
					case 'B':
						System.out.println("Calculadora Humana");
						CalculadoraHumana.calculadoraHumana();
						flag = false;
						break;
					case 'C':
						System.out.println("Palabra Más Larga");
						PalabraMasLarga.palabraMasLarga();
						flag = false;
						break;
					case 'D':
						System.out.println("Prueba Original");
						PruebaOriginal.puebraOriginal();
						flag = false;
						break;
					default:
						System.out.println("Opción no válida");
						break;
				}
			}
		}
	}
}
