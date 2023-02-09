package s3_01_n2_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory fabricaContacto = ProductoraFabricas.getFabrica(true);
		
		Contacto contactoNuevo = (Contacto) fabricaContacto.TipoDeDato(1);
		
		AbstractFactory fabricaDatos = ProductoraFabricas.getFabrica(false);
		
		Dato dato1 = fabricaDatos.TipoDeDato(2);
		dato1.ingresarDato();
		Dato dato2 = fabricaDatos.TipoDeDato(3);
		dato2.ingresarDato();
		Dato dato3 = fabricaDatos.TipoDeDato(4);
		dato3.ingresarDato();
		
		contactoNuevo.getContacto().add(dato1.getDato());
		contactoNuevo.getContacto().add(dato2.getDato());
		contactoNuevo.getContacto().add(dato3.getDato());		
		
		System.out.println(contactoNuevo.getContacto());
	}
}



