package s3_01_n3_pablogarciabarros;

public class Barco implements Vehiculo, Orden{
	
	static Barco barco;
	
	public Barco() {
		System.out.println("Nuevo barco");
		//barco = new Barco();
	}
	
	public String arrancar() {
		return "El barco ha arrancado";
	}
	
	public String acelerar() {
		return "El barco esta acelerando";
	}
	
	public String frenar() {
		return "El barco esta frenando";
	}
	
	public void ejecutar(int nroOrden) {
		if(nroOrden == 1) {
			barco.arrancar();
		}
		else if(nroOrden == 2) {
			barco.acelerar();
		}
		else if(nroOrden == 3) {
			barco.frenar();
		}
		else {
			System.out.println("El comando no es correcto");
		}
	}

}
