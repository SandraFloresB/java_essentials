package src1.tareas;

import libs.Input;

public class BotellasAguaSandra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Cuantos minutos tardas en la ducha? ");
		int minutos = Input.get_int();
		int botellas = minutos * 12;
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Botellas: " + botellas);

	}

}



//Implementa un programa que reporte el uso de agua de un usuario que dura x minutos en la 
//ducha expresado en botellas de agua.
//$ ./botellas_agua
//Minutos: 1
//Botellas: 12
//
//$ ./botellas_agua
//Minutos: 10
//Botellas: 120
