package principal;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		String apellido;
		float peso;
		float altura;
		float IMC;
		Scanner teclado=new Scanner(System.in);
		
		//Pido el nombre y apellido del usuario
		System.out.println("Nombre");
		nombre = teclado.next();
		System.out.println("Apellido:");
		apellido = teclado.next();
		
		//Pido que elija una opción de operación.
		System.out.println("Bienvenido " +nombre +" " +apellido
				+ "\nElige una opción:"
				+ "\n A.- Cálculo de tu índice de masa corporal (IMC)."
				+ "\n S.- Salir.");
		char caso = teclado.next().charAt(0);
		
		switch (caso) {
		case 'A':
			do {
			System.out.println("Perfecto " +nombre +","
					+ "\nPara calcular el IMC necesito que introduzcas los siguientes valores;\n "
					+ "Peso corporal (en KG):");
			peso = teclado.nextFloat();
			System.out.println("Y altura (en m):");
			altura = teclado.nextFloat();
			
			//Calculo el IMC en base a su peso y su altura
			IMC = peso/(altura * altura);
			
			if(IMC < 18) {
				System.out.println("Tu IMC es de " +IMC +": Delgadez Preocupante.");
			} else if(IMC >= 18 && IMC <= 25) {
				System.out.println("Tu IMC es de " +IMC +": Peso Adecuado.");
			} else {
				System.out.println("Tu IMC es de " +IMC +": Sobrepeso");
			}
			}while(peso == 0 || altura == 0);
			
			break;
		
		case 'S':
			System.out.println("Saliendo ...");
			break;
		}
		teclado.close();
	}

}
