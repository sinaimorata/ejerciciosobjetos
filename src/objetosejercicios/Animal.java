package objetosejercicios;

public abstract class Animal {
	protected Long adn;
	public Animal(Long adn) {
		this.adn = adn;
	}
	public abstract void hacerSonido();
	
	@Override
	public String toString() {
		return "Animal";
	}
	
}


//Ojo con la visibilidad. VER TABLA APUNTES.