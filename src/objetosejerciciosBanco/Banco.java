package objetosejerciciosBanco;
/*2. Banco. Crea una clase para modelar la cuenta bancaria de un banco, 
 * para ello debo de:
 a. Autenticarse
 b. Comprobar tus datos personales
 c. Consultar saldo
 d. Poder retirar efectivo
 e. Poder ingresar efectivo
  */
public class Banco {
	
	private String nombre;
	private String apellido;
	private double clave;
	private double saldo;
	
	
	public String getNombre() {
		return nombre;
	}
	//CONSULTAR SALDO
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getClave() {
		return clave;
	}
	public void setClave(double clave) {
		this.clave = clave;
	}
	public double acumularSaldo (int cantidad) {
		saldo = cantidad + saldo;
		return saldo;
	}
	public double retirarSaldo (int cantidad) {
		if (saldo>=cantidad) {
			saldo = saldo - cantidad;
			return saldo;
		}else {
			System.out.println("no es posible realizar la operacion");
		}
		return saldo;
	}
		
}
