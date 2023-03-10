package s3_01_n1_pablogarciabarros;

import java.util.ArrayList;

public class Undo<T> {
	
	public static Undo instancia;
	private ArrayList<T> comandos;

	//Por el patron Singletone se declara el constructor como privado para acceder a el desde la propia clase
	//con esto se evita que se cree mas de un objeto
	private Undo() {		
		this.comandos = new ArrayList<T>();		
	}
	
	//se accede al constructor desde este metodo donde si el objeto es null (no ha sido creado), invoca al constructor
	public static Undo getInstancia() {
		if(instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}
	
	public ArrayList<T> getComandos(){		
		return this.comandos;		
	}
	
	public void agregarComando(T com) {
		comandos.add(com);
	}
	
	public int buscarComando(T com) {
		int i = 0;
		while(i < instancia.comandos.size()) {
			if(instancia.comandos.get(i).equals(com)) {
				return i;
			}			
			i++;
		}
		return -1;
	}
	
	public void eliminarComando(T com) {
		
		if(buscarComando(com) >= 0) {
			instancia.comandos.remove(com);
			System.out.println("El comando ha sido eliminado");
		}
		else {
			System.out.println("El comando no esta ingresado");
		}		
	}


}
