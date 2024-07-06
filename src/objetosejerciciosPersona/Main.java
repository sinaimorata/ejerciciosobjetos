package objetosejerciciosPersona;
// PRUEBAS, INSTANCIAR,INICIALIZAR
/*1. Librería. Crea una clase Persona que tenga las siguientes propiedades propiedades:
 a. nombre(String)
 b. edad(int)
 c. direccion (String)
 d. UnmétodoshowInfo() que imprima la información de la persona.
 */


public class Main {

	public static void main(String[] args) {
		Person p = new Person ();
		p.setName ("Montse");
		//MODIFICAR, CAMBIAR
		p.setAge(20);
		p.setAddress("Calle Valmojado");
		System.out.println(p.showInfo(p.getName(),p.getAge(),p.getAddress()));
			
		

	}

}
