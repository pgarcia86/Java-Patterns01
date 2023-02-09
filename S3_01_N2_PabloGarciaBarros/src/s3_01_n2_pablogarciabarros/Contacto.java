package s3_01_n2_pablogarciabarros;

import java.util.ArrayList;

public class Contacto implements Dato{
	
	public ArrayList<Object> contacto;
	
	public void ingresarDato() {
		System.out.println("Se crea un array con el contacto");
		this.contacto = new ArrayList<Object>();
	}
	
	public ArrayList<Object> getContacto(){
		return this.contacto;
	}

}
