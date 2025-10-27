package principal;

public class Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 3, 7, 5, 9, 1, 6, 2, 4, 8};
		int aux;
		
		for(int cont = 0; cont < array.length; cont++) {
			System.out.println(array[cont]);
		}
		
		System.out.println("Ahora a ordenarlo");
		
		//Mostrar el array sin ordenar
		for(int i = 0; i < array.length -1; i++) {
			for(int j = 0; j<array.length -1 -i; j++) {
				if(array[j] > array[i]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}

	}

}
