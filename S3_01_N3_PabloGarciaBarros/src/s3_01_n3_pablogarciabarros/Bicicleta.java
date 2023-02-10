package s3_01_n3_pablogarciabarros;

public class Bicicleta implements Vehiculo{
	
	static Bicicleta bicicleta;
	
	public Bicicleta() {
		System.out.println("Nueva bicicleta");
	}
	
	@Override
	public void arrancar() {
		System.out.println("La bicicleta ha arrancado");
	}
	
	@Override
	public void acelerar() {
		System.out.println("La bicicleta esta acelerando");
	}
	
	@Override
	public void frenar() {
		System.out.println("La bicicleta esta frenando");
	}
}
