import java.util.Random;
import java.util.Scanner;

public class CifraExacta {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	static int marcadorPruebaJugador1 = 0;
	static int marcadorPruebaJugador2 = 0;

	static public boolean contieneNumero(int[] array, int numero) {
		boolean flag = false;
		for (int i : array) {
			if (i == numero) {
				flag = true;
			}
		}
		return flag;
	}

	static public int turnoJugador(int turno, int numero, int[] auxiliares) {
		int numeroJugador;
		if (turno == 1) {
			System.out.println("Turno del primer jugador");
		} else if (turno == 2) {
			System.out.println("Turno del segundo jugador");
		}do {
			System.out.println("Introduzca el primer número");
			numeroJugador = sc.nextInt();
			if (!contieneNumero(auxiliares, numeroJugador)) {
				System.out.println("Número no válido");
			}
		} while (!contieneNumero(auxiliares, numeroJugador));
		for (int i = 0; i < 5; i++) {
			int siguienteNumero;
			String operacion;
			do {
				System.out.println("Introduzca la siguiente operación");
				operacion = sc.next();
				if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*")
						&& !operacion.equals("/")) {
					System.out.println("Operación no reconocida");
				}
			} while (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*")
					&& !operacion.equals("/"));
			do {
				System.out.println("Introduzca el siguiente número");
				siguienteNumero = sc.nextInt();
				if (!contieneNumero(auxiliares, siguienteNumero) || (siguienteNumero == 0 && operacion.equals("/"))) {
					System.out.println("Número no válido");
				}
			} while (!contieneNumero(auxiliares, siguienteNumero) || (siguienteNumero == 0 && operacion.equals("/")));
			switch (operacion.charAt(0)) {
				case '+':
					numeroJugador += siguienteNumero;
					break;
				case '-':
					numeroJugador -= siguienteNumero;
					break;
				case '*':
					numeroJugador *= siguienteNumero;
					break;
				case '/':
					numeroJugador /= siguienteNumero;
					break;
			}
			System.out.println("El resultado es " + numeroJugador);
		}
		System.out.println("La puntuación es " + Math.abs(numero - numeroJugador));
		return (Math.abs(numero - numeroJugador));
	}

	static public int cifraExacta() {
		System.out.println("Bienvenidos a Cifra Exacta");
		int numero = random.nextInt(100, 1000);
		int[] auxiliares = new int[6];
		for (int i = 0; i < auxiliares.length; i++) {
			auxiliares[i] = random.nextInt(1, 10);
		}
		System.out.println("El número objetivo es " + numero);
		System.out.println("Los números auxiliares son: ");
		for (int i : auxiliares) {
			System.out.print(i + " ");
		}
		System.out.println();
		marcadorPruebaJugador1 = turnoJugador(1, numero, auxiliares);
		marcadorPruebaJugador2 = turnoJugador(2, numero, auxiliares);
		if (marcadorPruebaJugador1 > marcadorPruebaJugador2) {
			System.out.println("Ha ganado la prueba el primer jugador");
			return 1;
		} else if (marcadorPruebaJugador1 < marcadorPruebaJugador2) {
			System.out.println("Ha ganado la prueba el segundo jugador");
			return 2;
		}
		return 0;
	}
}
