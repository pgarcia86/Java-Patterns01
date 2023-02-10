package s3_01_n3_pablogarciabarros;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	
	private List<Mover> listaMovimiento = new ArrayList<Mover>();
	
	public void tomarMovimiento(Mover mover) {
		listaMovimiento.add(mover);
	}
	
	public void ejecutarMovimiento() {
		this.listaMovimiento.forEach(x -> x.ejecutar());
		this.listaMovimiento.clear();
	}

}
