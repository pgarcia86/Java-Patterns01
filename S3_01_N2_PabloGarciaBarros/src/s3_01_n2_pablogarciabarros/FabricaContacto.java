package s3_01_n2_pablogarciabarros;

public class FabricaContacto extends AbstractFactory{
	
	public Dato TipoDeDato(int nuevo) {
		if(nuevo == 1) {
			System.out.println("Se crea un nuevo contacto");
			return new Contacto();
		}
		return null;
	}
	
}
