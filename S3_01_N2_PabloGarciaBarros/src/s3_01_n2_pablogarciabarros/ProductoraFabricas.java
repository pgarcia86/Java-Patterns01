package s3_01_n2_pablogarciabarros;

//Creo el objeto que me va a crear el objeto que necesito

public class ProductoraFabricas {
	
	public static AbstractFactory getFabrica(boolean nuevo) {
		if(nuevo) {
			return new FabricaContacto();
		}
		else {
			return new FabricaDatos();
		}
	}
}
