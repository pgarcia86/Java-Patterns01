package s3_01_n3_pablogarciabarros;

public class main {
	
	//puedo crear una fabrica abstracta que me cree cada vehiculo en particular

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo una fabrica abstracta de vehiculos
		FabricaAbstracta fabrica = new FabricaVehiculo();
		
		Vehiculo coche = fabrica.tipoVehiculo(1);
		Vehiculo bicicleta = fabrica.tipoVehiculo(2);
		Vehiculo avion = fabrica.tipoVehiculo(3);
		Vehiculo barco = fabrica.tipoVehiculo(4);
		
		//Creo una fabrica abstracta de Movimientos
		FabricaAbstracta fabricaMovimiento = new FabricaMovimiento();
		
		Broker broker = new Broker();
		
		//Ejecuto las ordenes desde la clase Broker
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(1, coche));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(2, coche));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(3, coche));
		
		broker.ejecutarOrden();
		
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(1, avion));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(2, avion));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(3, avion));
		
		broker.ejecutarOrden();
		
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(1, barco));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(2, barco));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(3, barco));
		
		broker.ejecutarOrden();
		
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(1, bicicleta));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(2, bicicleta));
		broker.tomarOrden((Orden) fabricaMovimiento.tipoMovimiento(3, bicicleta));
		
		broker.ejecutarOrden();
	}
}

