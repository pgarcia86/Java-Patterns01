package s3_01_n3_pablogarciabarros;

public class FabricaVehiculo extends FabricaAbstracta{
	
	@Override
	public Vehiculo tipoVehiculo(int nroVehiculo) {
		if(nroVehiculo == 1) {
			return new Coche();
		}
		else if(nroVehiculo == 2) {
			return new Bicicleta();
		}
		else if(nroVehiculo == 3) {
			return new Avion();
		}
		else if(nroVehiculo == 4) {
			return new Barco();
		}
		else {
			System.out.println("La opcion no es valida");
			return null;
		}
	}
	
	public Movimiento tipoMovimiento(int tipoMovimiento, Vehiculo vehiculo) {
		return null;
	}
}

