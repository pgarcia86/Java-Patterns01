package s3_01_n3_pablogarciabarros;

public class Avion implements Vehiculo, Orden{
	
	static Avion avion;
	
	public Avion() {
		System.out.println("Nuevo avion");
		//avion = new Avion();
	}
	
	public String arrancar() {
		return "El avion ha arrancado";
	}
	
	public String acelerar() {
		return "El avion esta acelerando";
	}
	
	public String frenar() {
		return "El avion esta frenando";
	}
	
	public void ejecutar(int nroOrden) {
		if(nroOrden == 1) {
			avion.arrancar();
		}
		else if(nroOrden == 2) {
			avion.acelerar();
		}
		else if(nroOrden == 3) {
			avion.frenar();
		}
		else {
			System.out.println("El comando no es correcto");
		}
	}

}
