package objetosejercicios;

public class Perro extends Animal implements Mascota{
		
		//TODOS LOS CONSTRUCTORES DEBEN LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		public Perro() {
			super(0L);
		}

		@Override
		public void jugarConElDueño() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hacerSonido() {
			System.out.println("guau");
			
		}
}
