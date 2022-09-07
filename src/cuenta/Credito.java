package cuenta;

public class Credito extends Cuenta {
	
	@Override
	public void retirar(double c) {
		this.saldo+=c;
		System.out.println("Credito aprobado");
	}
	
}
