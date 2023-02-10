package s3_01_n3_pablogarciabarros;

public class Acelerar implements Mover, Movimiento{
	
	private Vehiculo vehiculo;
	
	public Acelerar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void ejecutar() {
		vehiculo.acelerar();
	}
}
