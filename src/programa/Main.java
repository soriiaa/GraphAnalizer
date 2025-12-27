package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Mensajes mensaje = new Mensajes();
		boolean repetir;
		boolean dirigido = false;
		ArrayList<String> grafoIntroducido = new ArrayList<>();
		String lineaLeida;

		do {
			
			mensaje.inicio();
			String lineaGrafoDirigido = in.nextLine();
			repetir = false;

			if ((lineaGrafoDirigido.equals("s")) || (lineaGrafoDirigido.equals("S"))) {
				dirigido = true;
			} else if ((lineaGrafoDirigido.equals("n")) || (lineaGrafoDirigido.equals("N"))) {
				dirigido = false;
			} else {
				mensaje.limpiarConsola();
				repetir = true;
			}
			
		} while (repetir);

		System.out.println("");
		System.out.println("   Introduzca el grafo en el siguiente formato: 'A B P' Arista A, Arista B, Peso:");
		System.out.println("   Para finalizar introduzca un .");
		System.out.println("");
		
		do {
			
			System.out.print("      >>> ");
			lineaLeida = in.nextLine();
			
			if (!lineaLeida.contains(".")) {
				grafoIntroducido.add(lineaLeida);
			}
			
		} while(!lineaLeida.contains("."));
		
		System.out.println("");
		System.out.println(grafoIntroducido);
		
		Grafo grafo = new Grafo(dirigido);
		grafo.crearMatrizAdyacencia(grafoIntroducido);

	}

}
