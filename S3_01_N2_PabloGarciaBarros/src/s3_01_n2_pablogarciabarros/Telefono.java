package s3_01_n2_pablogarciabarros;

import java.util.Scanner;

public class Telefono implements Dato{
	
	static Scanner entrada = new Scanner(System.in);
	
	String telefono;
	
	@Override
	public void ingresarDato() {
		System.out.println("Ingrese el numero de telefono");
		entrada.next();
		this.telefono = entrada.nextLine();
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public String toString() {
		return this.telefono;
	}
}
