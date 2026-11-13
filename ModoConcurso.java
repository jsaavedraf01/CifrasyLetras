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

		
		System.out.println("Marcador global:");
        System.out.println("Jugador 1: " + marcadorJugador1);
        System.out.println("Jugador 2: " + marcadorJugador2);


	}
}
