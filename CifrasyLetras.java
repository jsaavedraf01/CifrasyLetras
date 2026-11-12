import java.util.Scanner;

public class CifrasyLetras {
	static Scanner sc = new Scanner(System.in);

	static public void main(String[] args) throws Exception {
		boolean salir = true;
		do {
			System.out.println("¡¡Bienvenidos a Cifras y Letras!!");
			System.out.println("Escoga su opción:");
			System.out.println("A. Modo concurso");
			System.out.println("B. Modo rápido");
			System.out.println("C. Configuración");
			System.out.println("C. Salir");
			String answer = sc.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("A")) {
				ModoConcurso.modoConcurso();
			} else if (answer.equals("B")) {
				ModoRapido.modoRapido();
			} else if (answer.equals("C")) {
				Configuracion.configuracion();
			} else if (answer.equals("D")) {
				salir = false;
			}
		} while (salir);
	}
}