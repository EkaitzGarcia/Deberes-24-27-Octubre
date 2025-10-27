package principal;

/*Crear un array de 30 enteros RANDOM
 * Viauslaizarlo antes de ordenar
 * Ordenarlo de menor a mayor
 * Visualizarlo
 * Ordenarlo de mayor a menor
 * Visualizarlo
 * Eliminar elemento array
 * Visualizarlo*/

public class EjericioClase {
	//Metodo para ordenar de menor a mayor
	public static void MenorAMayor(int[] array) {
		int aux;
		
		for(int i = 0; i < array.length -1; i++) {
			for(int h = 0; h < array.length -1 -i; h++) {
				if(array[h] > array[h + 1]) {
					aux = array[h];
					array[h] = array[h + 1];
					array[h + 1] = aux;
				}
			}
		}
		
		for(int j = 0; j < array.length; j++) {
			System.out.println(array[j] +"");
		}
	}
	
	//Metodo para ordenar de mayor a menor
	public static void MayorAMenor(int[] array) {
		int aux;
		
		for(int i = 0; i < array.length -1; i++) {
			for(int h = 0; h < array.length -1 -i; h++) {
				if(array[h] < array[h + 1]) {
					aux = array[h];
					array[h] = array[h + 1];
					array[h + 1] = aux;
				}
			}
		}
		
		for(int j = 0; j < array.length; j++) {
			System.out.println(array[j] +"");
		}
	}
	
	//Metodo para eliminar elemento del array
	
	public static void Eliminar(int[] array) {
		int elimino;
		int contador = 10; //Dar valor luego con la cantidad de posiciones del array
		System.out.println("¿Que número quieres quitar del array?");
		elimino = Util.leerInt();
		
		for(int i = 0; i < contador; i++) {
			if(array[i] == elimino) {
				for(int h = i; h < contador - 1; h++) {
					array[h] = array[h + 1];
				}
				contador--;
			}
		}
	}
}
