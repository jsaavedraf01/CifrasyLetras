import java.util.Random;

public class PruebaOriginal {

    static Random random = new Random();

    static public int turnoJugador(int jugador, int numero) {

        int intentos = 0;
        boolean acertado = false;

        System.out.println("\nTurno del jugador " + jugador);
        System.out.println("Adivina el número entre 1 y 20");

        for (int i = 0; i < 5 && !acertado; i++) {

            System.out.println("Introduce un número:");
            int respuesta = CifrasyLetras.sc.nextInt();

            intentos++;

            if (respuesta == numero) {
                System.out.println("¡Correcto!");
                acertado = true;
            } else if (respuesta < numero) {
                System.out.println("El número secreto es mayor");
            } else {
                System.out.println("El número secreto es menor");
            }
        }

        if (!acertado) {
            System.out.println("No has conseguido adivinarlo");
            return 0;
        }

        System.out.println("Has acertado en " + intentos + " intentos");

        return intentos;
    }

    static public int pruebaOriginal() {

        System.out.println("\n===== ADIVINA EL NÚMERO =====");

        int numeroJugador1 = random.nextInt(1, 21);
        int numeroJugador2 = random.nextInt(1, 21);

        int intentosJugador1 = turnoJugador(1, numeroJugador1);
        int intentosJugador2 = turnoJugador(2, numeroJugador2);

        if (intentosJugador1 == 0 && intentosJugador2 == 0) {
            return 0;
        } else if (intentosJugador1 == 0) {
            return 2;
        } else if (intentosJugador2 == 0) {
            return 1;
        } else if (intentosJugador1 < intentosJugador2) {
            return 1;
        } else if (intentosJugador2 < intentosJugador1) {
            return 2;
        } else {
            return 0;
        }
    }
}
