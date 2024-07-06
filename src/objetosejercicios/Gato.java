package objetosejercicios;

public class Gato
	extends Animal implements Mascota{
	
	//TODOS LOS CONSTRUCTORES DEBEN LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
	public Gato() {
		super(0L);
	}

	@Override
	public void jugarConElDueño() {
		// TODO Auto-generated method stub
		
	}

	//ACCESO A UNA PROPIEDAD PROTECTED
	public void hacerSonido() {
		System.out.println(adn);
		System.out.println("Silencio");
	}
}	

