package s3_01_n2_pablogarciabarros;

import java.util.Scanner;

public class Nombre implements Dato{
	
	static Scanner entrada = new Scanner(System.in);
	
	String nombre;
	
	@Override
	public void ingresarDato() {
		System.out.println("Ingrese el nombre");
		this.nombre = entrada.nextLine();
	}
	
	public String getDato() {
		return this.nombre;
	}
}

