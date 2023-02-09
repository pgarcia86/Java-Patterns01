package s3_01_n2_pablogarciabarros;

public class FabricaDatos extends AbstractFactory {
	
	@Override
	public Dato TipoDeDato(int tipoDato) {
		if(tipoDato == 2) {
			return new Nombre();
		}
		else if(tipoDato == 3) {
			return new Telefono();
		}
		else if(tipoDato == 4) {
			return new Direccion();
		}
		else {
			System.out.println("Opcion no valida");
			return null;
		}
	}
}

