import java.util.Random;
import java.util.Scanner;

public class PalabraMasLarga {
	static int marcadorPruebaJugador1 = 0;
	static int marcadorPruebaJugador2 = 0;
	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	static String letrasAleatorias = "";

	static public boolean validacionUsuario(String palabra, int jugador) {
		String respuesta = "";
		boolean valida = false;
		do {
			System.out.println("Jugador " + jugador + ", es una palabra válida del diccionario? Introduzca S o N");
			respuesta = sc.next();
			respuesta = respuesta.toUpperCase();
			if (respuesta.equals("S")) {
				valida = true;
			}
		} while (!respuesta.equals("S") && !respuesta.equals("N"));
		return valida;
	}

	static public int cantidadLetras(String palabra, char letra) {
		int cantidad = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == letra) {
				cantidad++;
			}
		}
		return cantidad;
	}

	static public boolean validacionLetras(String palabra) {
		boolean valida = true;
		palabra = palabra.toLowerCase();
		for (int i = 0; i < palabra.length() && valida; i++) {
			int cantidadA = cantidadLetras(palabra, palabra.charAt(i));
			int cantidadB = cantidadLetras(letrasAleatorias, palabra.charAt(i));
			if (cantidadA > cantidadB) {
				valida = false;
			}
		}
		if (!valida) {
			System.out.println("La palabra tiene letras no válidas");
		} else {
			System.out.println("Todas las letras son válidas");
		}
		return valida;
	}

	static public int turnoJugador(int jugador) {
		boolean validaUsuario = false;
		boolean validaLetras = false;
		String palabra = "";
		int jugadorContrario = jugador == 1 ? 2 : 1;
		do {
			System.out.println("Jugador " + jugador + " introduzca una palabra");
			palabra = sc.next();
			validaUsuario = validacionUsuario(palabra, jugadorContrario);
			validaLetras = validacionLetras(palabra);
		} while (!validaUsuario || !validaLetras);
		System.out.println("¡La palabra es válida!");
		return palabra.length();
	}

	static public int palabraMasLarga() {
		String vocales = "aeiou";
		String consonantes = "bcdfghjklmnpqrstvwxyz";
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("¡Bienvenidos a Palabra Más Larga!");
		for (int i = 0; i < 10; i++) {
			if (i < 4) {
				letrasAleatorias = letrasAleatorias + vocales.charAt(random.nextInt(0, vocales.length()));
			} else if (i < 8) {
				letrasAleatorias = letrasAleatorias + consonantes.charAt(random.nextInt(0, consonantes.length()));
			} else {
				letrasAleatorias = letrasAleatorias + alfabeto.charAt(random.nextInt(0, alfabeto.length()));
			}
		}
		System.out.println("Las letras a utilizar son: " + letrasAleatorias);
		marcadorPruebaJugador1 = turnoJugador(1);
		marcadorPruebaJugador2 = turnoJugador(2);
		System.out.println("La puntuación de jugador 1 es " + marcadorPruebaJugador1);
		System.out.println("La puntuación de jugador 2 es " + marcadorPruebaJugador2);
		if (marcadorPruebaJugador1 > marcadorPruebaJugador2) {
			return 1;
		} else if (marcadorPruebaJugador1 < marcadorPruebaJugador2) {
			return 2;
		} else {
			return 0;
		}
	}
}
