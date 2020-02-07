package src1.tareas;

import libs.Input;

public class MarioFacilSandra {

	public static void main(String[] args) {
	
		System.out.println("Indica la altura de la piramide: ");
		int altura = Input.get_int();
		int a = 0;
		String caracteres = "#";

		//Ciclo para imprimir renlon
		for(int i = 0, n = altura; i < n; i++) {
			int esp = altura - 1;
			String espacios = "";   //inicializa los espacios para cada renglon
				
			   //Ciclo para agregar espacios al renglon
				for(int ren = a; ren != altura-1; ren++ ) {
					espacios = espacios + " ";
				}
				
				//Agrega caracteres al renglon
				caracteres = caracteres + "#";
				a = a + 1;

			//Imprime renglon	
			System.out.println(espacios + caracteres);
		}
		
		
	}
}


//
//Implementa un programa que imprima una media piramide de una altura especificada por el usuario, como abajo:
//
//$ ./mario
//Altura: 5
//    ##
//   ###
//  ####
// #####
//######
//
//$ ./mario
//Altura: 3
//  ##
// ###
//####

