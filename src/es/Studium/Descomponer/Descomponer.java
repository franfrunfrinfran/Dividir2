package es.Studium.Descomponer;

import java.util.Scanner;

public class Descomponer {

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner (System.in);
	
	String cadena, cadena2;
	
	System.out.println("Escriba una cadena");
	cadena=teclado.nextLine();
	
	cadena2=cadena.replace(' ', '\n');
	System.out.println(cadena2);
	
	teclado.close();
	}

}
