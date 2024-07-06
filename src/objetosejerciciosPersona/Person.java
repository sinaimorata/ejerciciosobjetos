package objetosejerciciosPersona;

/*1. Librería. Crea una clase Persona que tenga las siguientes propiedades propiedades:
 a. nombre(String)
 b. edad(int)
 c. direccion (String)
 d. Un método showInfo() que imprima la información de la persona.
 
 */

//Modificadores de acceso: public y private
// LAS PROPIEDADES DE ACCESO SON PRIVADAS- BUENA PRACTICA

public class Person {

	
		private String name;
		private int age;
		private String address;
		// consulta, dame el nombre grabado en ese modelo
		//solo accede al valor q había
		public String getName(){
			return name;
		}
		//set: modificar, cambiar. x
		//THIS. hace referencia al ambito del propio obj. EVITAR conflicto de variables. Opc. cambiar nombre
		public void setName(String name) {
			this.name = name;
		}
		public int getAge(){
			return age;
			
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String showInfo (String name, int age, String direccion) {
			return "el nombre es :  "+ name +  " la edad es : " + age  +" la direccion es : "+ direccion;
			
		}
	}


