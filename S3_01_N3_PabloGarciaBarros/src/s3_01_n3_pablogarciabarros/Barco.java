package s3_01_n3_pablogarciabarros;

public class Barco implements Vehiculo{
	
	static Barco barco;
	
	public Barco() {
		System.out.println("Nuevo barco");
	}
	
	@Override
	public void arrancar() {
		System.out.println("El barco ha arrancado");
	}
	
	@Override
	public void acelerar() {
		System.out.println("El barco esta acelerando");
	}
	
	@Override
	public void frenar() {
		System.out.println("El barco esta frenando");
	}
}
