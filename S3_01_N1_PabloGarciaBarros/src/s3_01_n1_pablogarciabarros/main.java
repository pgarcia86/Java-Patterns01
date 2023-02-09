package s3_01_n1_pablogarciabarros;

import java.util.Scanner;

public class main {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int opcion;
		T comando;
		
		Undo u = Undo.getInstancia();
		
		do{
			System.out.println("\nIngrese la opcion: \n" + 
					"1. Agregar comando\n" +
					"2. Eliminar comando\n" + 
					"3. Listar comandos\n" +
					"0. Salir");			
			opcion = entrada.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("\nIngrese el comando");
					comando = (T) entrada.next();
					u.agregarComando(comando);
					break;
				case 2:
					System.out.println("\nIngrese el comando a eliminar");
					comando = (T) entrada.next();
					u.eliminarComando(comando);
					break;
				case 3:
					System.out.println(u.getComandos());
					break;
				case 0:
					System.out.println("\nSaliendo");
			}
			
		}while(opcion != 0);	
		
	}

}
