package s3_01_n3_pablogarciabarros;

public abstract class FabricaAbstracta {
	
	abstract Vehiculo tipoVehiculo(int nroVehiculo);
	
	abstract Movimiento tipoMovimiento(int tipoMovimiento, Vehiculo vehiculo);

}
