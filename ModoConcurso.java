public class ModoConcurso {
	static int marcadorJugador1 = 0;
	static int marcadorJugador2 = 0;

	static public void modoConcurso() {
		System.out.println("Modo concurso");
		System.out.println("¡Bienvenidos al modo concurso!");
		System.out.println("Se jugará " + Configuracion.numeroPruebas + " veces cada prueba");
		System.out.println("Cada prueba da un punto al ganador y quien tenga más puntos al final gana");

		int ganador;
		for (int i = 1; i <= Configuracion.numeroPruebas; i++) {
			ganador = CifraExacta.cifraExacta();

			if (ganador == 1) {
				marcadorJugador1++;
			} else if (ganador == 2) {
				marcadorJugador2++;
			}

			ganador = PalabraMasLarga.palabraMasLarga();

			if (ganador == 1) {
				marcadorJugador1++;
			} else if (ganador == 2) {
				marcadorJugador2++;
			}

			ganador = CalculadoraHumana.calculadoraHumana();

			if (ganador == 1) {
				marcadorJugador1++;
			} else if (ganador == 2) {
				marcadorJugador2++;
			}

			ganador = PruebaOriginal.puebraOriginal();

			if (ganador == 1) {
				marcadorJugador1++;
			} else if (ganador == 2) {
				marcadorJugador2++;
			}
		}

		System.out.println("Marcador global:");
		System.out.println("Jugador 1: " + marcadorJugador1);
		System.out.println("Jugador 2: " + marcadorJugador2);
		if (marcadorJugador1 > marcadorJugador2) {
			System.out.println("¡Ha ganado el jugador 1!");
		} else if (marcadorJugador1 < marcadorJugador2) {
			System.out.println("¡Ha ganado el jugador 2!");
		} else {
			System.out.println("¡Un empate! ¡Más igualados imposible!");
		}
	}
}
