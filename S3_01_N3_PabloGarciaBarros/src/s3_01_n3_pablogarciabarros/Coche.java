package s3_01_n3_pablogarciabarros;

public class Coche implements Vehiculo, Orden{

	static Coche coche;
	
	public Coche() {
		System.out.println("Nuevo coche");
	}
	
	public String arrancar() {
		return "El coche ha arrancado";
	}
	
	public String acelerar() {
		return "El coche esta acelerando";
	}
	
	public String frenar() {
		return "El coche esta frenando";
	}
	
	public void ejecutar(int nroOrden) {
		if(nroOrden == 1) {
			coche.arrancar();
		}
		else if(nroOrden == 2) {
			coche.acelerar();
		}
		else if(nroOrden == 3) {
			coche.frenar();
		}
		else {
			System.out.println("El comando no es correcto");
		}
	}
	
}
