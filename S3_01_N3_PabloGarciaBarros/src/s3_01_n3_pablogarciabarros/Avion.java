package s3_01_n3_pablogarciabarros;

public class Avion implements Vehiculo{
	
	static Avion avion;
	
	public Avion() {
		System.out.println("Nuevo avion");
	}
	
	@Override
	public void arrancar() {
		System.out.println("El avion ha arrancado");
	}
	
	@Override
	public void acelerar() {
		System.out.println("El avion esta acelerando");
	}
	
	@Override
	public void frenar() {
		System.out.println("El avion esta frenando");
	}
}
