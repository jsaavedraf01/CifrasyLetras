import java.util.Scanner;

public class CalculadoraHumana {
	static int marcadorPrueba = 0;		
    static int cantidadOperaciones = 5;

	static public int calculadoraHumana() {
		System.out.println("Calculadora Humana");

			  Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA HUMANA");

        // Jugador 1
        System.out.println("\nTurno del jugador 1");
        double tiempo1 = jugarTurno(sc);

        // Jugador 2
        System.out.println("\nTurno del jugador 2");
        double tiempo2 = jugarTurno(sc);

        // Comparamos los tiempos
        if (tiempo1 < tiempo2) {
            System.out.println("Gana el jugador 1");
            marcadorPrueba = 1;
        } else if (tiempo2 < tiempo1) {
            System.out.println("Gana el jugador 2");
            marcadorPrueba = 2;
        } else {
            System.out.println("Empate");
            marcadorPrueba = 0;
        }

        return marcadorPrueba;
    }

    public static double jugarTurno(Scanner sc) {

        int numero = (int) (Math.random() * 100) + 1;
        int fallos = 0;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < cantidadOperaciones; i++) {

            int operacion = (int) (Math.random() * 4);
            int valor;
		    int resultado;

            if (operacion == 0 || operacion == 1) {
                valor = (int) (Math.random() * 90) + 10;
            } else {
                valor = (int) (Math.random() * 9) + 1;
            }

            if (operacion == 0) {
                resultado = numero + valor;
                System.out.println(numero + " + " + valor);
            } else if (operacion == 1) {
                resultado = numero - valor;
                System.out.println(numero + " - " + valor);
            } else if (operacion == 2) {
                resultado = numero * valor;
                System.out.println(numero + " * " + valor);
            } else {
                while (numero % valor != 0) {
                    valor = (int) (Math.random() * 9) + 1;
                }

                resultado = numero / valor;
                System.out.println(numero + " / " + valor);
            }

            System.out.println("Introduce el resultado:");
            int respuesta = sc.nextInt();

            if (respuesta == resultado) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto. El resultado era: " + resultado);
                fallos++;
            }

            numero = resultado;
        }

        long fin = System.currentTimeMillis();

        double tiempo = (fin - inicio) / 1000.0;

        tiempo = tiempo + (fallos * 20);

        System.out.println("Fallos: " + fallos);
        System.out.println("Tiempo total: " + tiempo + " segundos");

        return tiempo;
    }
}