package cuenta;

public class Cuenta {
	double saldo;
	
	public Cuenta() {
		System.out.println("Cuenta creada");
	}
	public Cuenta(double saldo) {
		this.saldo = saldo;
		System.out.println("Cuenta creada con saldo");
	}
	public void ingresar(double c) {
		if(c>0) {
			this.saldo += c;}
		else {System.out.println("No se aceptan numeros negativos");}
		
	}
	
	public void retirar(double c) {
		if(this.saldo>=c & c>0) {
			this.saldo-=c;
			System.out.println("Retiro exitoso");
		}else { 
			System.out.println(c>0 ?"Saldo insuficiente": "no se acepta numeros negativos");
		}
	}
	
	public double getsaldo() {
		return this.saldo;
	}
	
}
