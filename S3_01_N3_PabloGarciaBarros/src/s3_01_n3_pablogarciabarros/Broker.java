package s3_01_n3_pablogarciabarros;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Orden> listaOrden = new ArrayList<Orden>();
	
	public void tomarOrden(Orden orden) {
		listaOrden.add(orden);
	}
	
	public void ejecutarOrden() {
		for (Orden orden : listaOrden) {
			orden.ejecutar();
		}
		listaOrden.clear();
	}

}
