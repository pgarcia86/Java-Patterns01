package s3_01_n3_pablogarciabarros;

public class Frenar implements Mover, Movimiento{
	
	private Vehiculo vehiculo;
	
	public Frenar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void ejecutar() {
		vehiculo.frenar();
	}
	
}
