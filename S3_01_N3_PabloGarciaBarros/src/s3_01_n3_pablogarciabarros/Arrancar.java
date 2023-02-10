package s3_01_n3_pablogarciabarros;

public class Arrancar implements Mover, Movimiento{
	
	private Vehiculo vehiculo;
	
	public Arrancar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	@Override
	public void ejecutar() {
		vehiculo.arrancar();
	}


}
