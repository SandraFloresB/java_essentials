package src1.tareas;

import libs.Input;

public class MarioDificilSandra {

	public static void main(String[] args) {
		
		System.out.print("Indica la altura de la piramide: ");
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
			System.out.println(espacios + caracteres + "  " + caracteres);
		}
		
		
	}

}



//Implementa un programa que muestre una piramide doble como la que se muestra abajo.
//
//$ ./mario
//Altura: 4
//   #  #
//  ##  ##
// ###  ###
//####  ####
