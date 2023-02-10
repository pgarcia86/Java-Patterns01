package s3_01_n3_pablogarciabarros;

public class Coche implements Vehiculo{

	static Coche coche;
	
	public Coche() {
		System.out.println("Nuevo coche");
	}
	
	@Override
	public void arrancar() {
		System.out.println("El coche ha arrancado");
	}
	
	@Override
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	
	@Override
	public void frenar() {
		System.out.println("El coche esta frenando");
	}	
}
