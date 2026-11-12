public class ModoConcurso {
	static int marcador	Jugador1 = 0;
	static int marcador	Jugador2 = 0;

	static public void modoConcurso() {
		
		System.out.println("Modo concurso");

		int ganador = CifraExacta.cifraExacta();

		if (ganador == 1) {
			marcador	Jugador1++;
		} else if (ganador == 2) {
			marcador	Jugador2++;
		}

		ganador = PalabraMasLarga.palabraMasLarga();

		if (ganador == 1) {
			marcador	Jugador1++;
		} else if (ganador == 2) {
			marcador	Jugador2++;
		}

		
		System.out.println("Marcador global:");
        System.out.println("Jugador 1: " + marcadorJugador1);
        System.out.println("Jugador 2: " + marcadorJugador2);


	}
}
