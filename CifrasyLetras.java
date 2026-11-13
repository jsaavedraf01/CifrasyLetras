import java.util.Scanner;

public class CifrasyLetras {
	static Scanner sc = new Scanner(System.in);

	static public void mostrarMenu() {
			System.out.println("¡¡Bienvenidos a Cifras y Letras!!");
			System.out.println("Escoga su opción:");
			System.out.println("A. Modo concurso");
			System.out.println("B. Modo rápido");
			System.out.println("C. Configuración");
			System.out.println("D. Salir");
	}
	static public void main(String[] args) throws Exception {
		boolean salir = false;
		do {
			String answer = sc.nextLine();
			answer = answer.toLowerCase();
			switch (answer.charAt(0)) {
				case 'a':
					ModoConcurso.modoConcurso();
					break;
				case 'b':
					ModoRapido.modoRapido();
					break;
				case 'c':
					Configuracion.configuracion();
					break;
				case 'd':
					salir = true;
					break;
			}
		} while (!salir);
	}
}