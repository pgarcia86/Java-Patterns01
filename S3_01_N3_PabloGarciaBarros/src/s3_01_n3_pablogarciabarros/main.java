package s3_01_n3_pablogarciabarros;

public class main {
	
	//puedo crear una fabrica abstracta que me cree cada vehiculo en particular

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo una fabrica abstracta de vehiculos
		FabricaAbstracta fabrica = new FabricaVehiculo();
		
		//Creo cada uno de los vehiculos
		Vehiculo coche = fabrica.tipoVehiculo(1);
		Vehiculo bicicleta = fabrica.tipoVehiculo(2);
		Vehiculo avion = fabrica.tipoVehiculo(3);
		Vehiculo barco = fabrica.tipoVehiculo(4);
		
		//Creo una fabrica abstracta de Movimientos
		FabricaAbstracta fabricaMovimiento = new FabricaMovimiento();		
				
		Broker broker = new Broker();
		System.out.println("\n");
		
		//Ejecuto las ordenes desde la clase Broker
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(1, coche));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(2, coche));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(3, coche));
		
		broker.ejecutarMovimiento();
		System.out.println("\n");
		
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(1, avion));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(2, avion));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(3, avion));
		
		broker.ejecutarMovimiento();
		System.out.println("\n");
		
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(1, barco));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(2, barco));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(3, barco));
		
		broker.ejecutarMovimiento();
		System.out.println("\n");
		
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(1, bicicleta));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(2, bicicleta));
		broker.tomarMovimiento((Mover) fabricaMovimiento.tipoMovimiento(3, bicicleta));
		
		broker.ejecutarMovimiento();
	}
}

