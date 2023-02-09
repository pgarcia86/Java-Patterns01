package s3_01_n2_pablogarciabarros;

import java.util.Scanner;

public class Direccion implements Dato{

	static Scanner entrada = new Scanner(System.in);
	
	String direccion;
	
	@Override
	public void ingresarDato() {
		System.out.println("Ingrese la direccion");
		this.direccion = entrada.nextLine();
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String toString() {
		return this.direccion;
	}
}
