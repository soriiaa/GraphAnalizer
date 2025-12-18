package programa;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("");
		System.out.println("  ██████╗ ██████╗  █████╗ ██████╗ ██╗  ██╗     █████╗ ███╗   ██╗ █████╗ ██╗     ██╗███████╗███████╗██████╗ \r\n"
				+ " ██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██║  ██║    ██╔══██╗████╗  ██║██╔══██╗██║     ██║╚══███╔╝██╔════╝██╔══██╗\r\n"
				+ " ██║  ███╗██████╔╝███████║██████╔╝███████║    ███████║██╔██╗ ██║███████║██║     ██║  ███╔╝ █████╗  ██████╔╝\r\n"
				+ " ██║   ██║██╔══██╗██╔══██║██╔═══╝ ██╔══██║    ██╔══██║██║╚██╗██║██╔══██║██║     ██║ ███╔╝  ██╔══╝  ██╔══██╗\r\n"
				+ " ╚██████╔╝██║  ██║██║  ██║██║     ██║  ██║    ██║  ██║██║ ╚████║██║  ██║███████╗██║███████╗███████╗██║  ██║\r\n"
				+ "  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝  ╚═╝    ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝╚═╝╚══════╝╚══════╝╚═╝  ╚═╝\r\n"
				+ "                                                                                                           ");
		System.out.println("");
		System.out.print("   ¿El grafo es dirigido? (s/n):");
		String lineaGrafoDirigido = in.nextLine();
		
		if ((lineaGrafoDirigido.equals("s")) || (lineaGrafoDirigido.equals("n")) || (lineaGrafoDirigido.equals("S")) || (lineaGrafoDirigido.equals("N"))) {
			
		}
		
		System.out.println("   Introduzca el grafo en el siguiente formato: 'A B P' Arista A, Arista B, Peso:");
		System.out.println("");
		System.out.print("      >>> ");
		String lineaLeida = in.nextLine();
		System.out.println("");
		System.out.println(lineaLeida);
		
	}

	
	
}
