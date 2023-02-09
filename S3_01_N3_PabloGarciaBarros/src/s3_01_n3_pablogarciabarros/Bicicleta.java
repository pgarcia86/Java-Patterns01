package s3_01_n3_pablogarciabarros;

public class Bicicleta implements Vehiculo, Orden{
	
	static Bicicleta bicicleta;
	
	public Bicicleta() {
		System.out.println("Nueva bicicleta");
		//bicicleta = new Bicicleta();
	}
	
	public String arrancar() {
		return "La bicicleta ha arrancado";
	}
	
	public String acelerar() {
		return "La bicicleta esta acelerando";
	}
	
	public String frenar() {
		return "La bicicleta esta frenando";
	}
	
	public void ejecutar(int nroOrden) {
		if(nroOrden == 1) {
			bicicleta.arrancar();
		}
		else if(nroOrden == 2) {
			bicicleta.acelerar();
		}
		else if(nroOrden == 3) {
			bicicleta.frenar();
		}
		else {
			System.out.println("El comando no es correcto");
		}
	}

}
