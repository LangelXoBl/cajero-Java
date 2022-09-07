package cuenta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int op=6;
		double num;
		Cuenta cl = null;
		Credito cre=null;
		
		while (op!=0) {
			System.out.println("1.Crear cuenta vacia");
			System.out.println("2.Crear cuenta saldo inicial");
			
			if(cl!=null) {
				System.out.println("3.Solicitar credito");
				System.out.println("4.Ingresar dinero");
				System.out.println("5.Retirar dinero");
				System.out.println("6.Ver saldo a favor");
				System.out.println("7.Ver saldo a deber");
			}
			System.out.println("0.Salir");
			
			System.out.print("Escriba la opcion: ");
			op=lector.nextInt();
			switch (op) {
			case 1:
				cl  = new Cuenta();			
				break;
			case 2:
				System.out.print("Escriba la cantidad: ");
				num= lector.nextDouble();
				cl = new Cuenta(num);
				break;
			case 3:
				if(cl!=null) {
					System.out.print("Cantidad el prestamo: ");
					num= lector.nextDouble();
					cre =  new Credito();
					cre.retirar(num);
				}else {System.out.println("Debes crear una cuenta");}
				break;
			case 4:
				if(cl!=null) {
					System.out.print("Escriba la cantidad: ");
					num= lector.nextDouble();
					cl.ingresar(num);
				}else {System.out.println("Debes crear una cuenta");}
				break;
			case 5:
				if(cl!=null) {
					System.out.print("Escriba la cantidad: ");
					num = lector.nextDouble();
					cl.retirar(num);
				}else {System.out.println("Debes crear una cuenta");}
				break;
			case 6:
				if(cl!=null) {
					System.out.println("Saldo activo: "+cl.getsaldo());
				}else {System.out.println("Debes crear una cuenta");}
				break;
			case 7:
				if(cre!=null) {
					System.out.println("Saldo a deber: "+cre.getsaldo());
				}else {System.out.println(cl==null?"Debes crear una cuenta":"No has solicitado ningun prestamo");}
				break;
			case 0:
				System.out.println("Vuelva pronto");
				break;
			default:
				System.out.println("opcion no encontrada");
				break;
			}
			System.out.println("<--------------------------------------->");
		}
		lector.close();
	}
}