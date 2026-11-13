public class ModoConcurso {
	static int marcadorJugador1 = 0;
	static int marcadorJugador2 = 0;

	static public void modoConcurso() {
		
		System.out.println("Modo concurso");

		int ganador = CifraExacta.cifraExacta();

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

		ganador = PruebaOriginal.pruebaOriginal();

		if (ganador == 1) {
			marcadorJugador1++;
		} else if (ganador == 2) {
			marcadorJugador2++;
		}

		
		System.out.println("Marcador global:");
        System.out.println("Jugador 1: " + marcadorJugador1);
        System.out.println("Jugador 2: " + marcadorJugador2);

		  if (marcadorJugador1 > marcadorJugador2) {
            System.out.println("Gana el jugador 1");
        } else if (marcadorJugador2 > marcadorJugador1) {
            System.out.println("Gana el jugador 2");
        } else {
            System.out.println("Empate");
        }


	}
}
