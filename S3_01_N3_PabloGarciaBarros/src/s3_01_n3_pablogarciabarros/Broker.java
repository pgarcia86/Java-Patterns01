package s3_01_n3_pablogarciabarros;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Orden> listaOrdenes = new ArrayList<Orden>();
	
	public void recibirOrden(Orden orden) {
		listaOrdenes.add(orden);
	}
	
	public void ejecutarOrden() {
		for(Orden o : listaOrdenes) {
			o.ejecutar(1);
		}
		listaOrdenes.clear();
	}
}
