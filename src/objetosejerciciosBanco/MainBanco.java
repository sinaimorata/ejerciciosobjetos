package objetosejerciciosBanco;

public class MainBanco {

	public static void main(String[] args) {
		Banco cuentaMontse = new Banco ();
		cuentaMontse.setNombre("Javi");
		cuentaMontse.setApellido("Moreno");
		cuentaMontse.setClave(1234);
		cuentaMontse.setSaldo(100);
		cuentaMontse.acumularSaldo(30);
		cuentaMontse.retirarSaldo(10);
		
		System.out.println(cuentaMontse.retirarSaldo(10));
	}

}
// FALTA AUTENTICAR