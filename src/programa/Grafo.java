package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Grafo {

	private boolean dirigido;
	private String[] nodos;
	private int[] matrizAdyacencia;

	public Grafo(boolean dirigido) {
		this.dirigido = dirigido;
	}
	
	public void crearMatrizAdyacencia(ArrayList<String> grafoIntroducido) {
		
		HashSet<String> listaNodosExistentes = new HashSet<>();
		
		for (int i = 0; i < grafoIntroducido.size(); i++) {
			String[] linea = grafoIntroducido.get(i).split(" ");
			listaNodosExistentes.add(linea[0]);
			listaNodosExistentes.add(linea[1]);
		}
		
		nodos = listaNodosExistentes.toArray(new String[0]);
		
		System.out.println(Arrays.toString(nodos));
		
	}

}
