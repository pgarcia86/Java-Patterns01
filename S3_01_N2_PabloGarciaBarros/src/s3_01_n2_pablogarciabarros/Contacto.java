package s3_01_n2_pablogarciabarros;

import java.util.ArrayList;

public class Contacto implements Dato{
	
	public ArrayList<String> contacto;
	
	public Contacto() {
		System.out.println("Se crea un array con el contacto");
		this.contacto = new ArrayList<String>();
	}
	
	public void ingresarDato() {}
	
	public ArrayList<String> getContacto(){
		return this.contacto;
	}
	
	public String getDato() {
		return "";
	}
}
