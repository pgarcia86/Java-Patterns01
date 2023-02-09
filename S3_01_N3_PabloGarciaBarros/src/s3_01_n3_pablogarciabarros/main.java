package s3_01_n3_pablogarciabarros;

public class main {
	
	//puedo crear una fabrica abstracta que me cree cada vehiculo en particular

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FabricaAbstracta fabrica = new FabricaVehiculo();
		
		fabrica.tipoVehiculo(1);
		fabrica.tipoVehiculo(2);
		fabrica.tipoVehiculo(3);
		fabrica.tipoVehiculo(4);

	}

}

