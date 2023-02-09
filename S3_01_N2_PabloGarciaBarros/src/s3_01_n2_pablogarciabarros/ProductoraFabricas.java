package s3_01_n2_pablogarciabarros;

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
