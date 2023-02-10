package s3_01_n3_pablogarciabarros;

public class FabricaMovimiento extends FabricaAbstracta{
	
	public Movimiento tipoMovimiento(int tipoMovimiento, Vehiculo vehiculo) {
		
		if(tipoMovimiento == 1) {
			return new Arrancar(vehiculo);
		}
		else if (tipoMovimiento == 2) {
			return new Acelerar(vehiculo);
		}
		else {
			return new Frenar(vehiculo);
		}
	}
	
	public Vehiculo tipoVehiculo(int nroVehiculo) {
		return null;
	}

}
