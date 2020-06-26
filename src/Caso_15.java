import java.util.Scanner;

public class Caso_15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Cliente: ");
		String cliente= sc.nextLine();

		System.out.print("Ingrese el Producto [TB/LT/MN/IM/otro]: ");
		String producto = sc.nextLine();

		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();

		System.out.print("Ingrese forma de pago [C1/C2]: ");
		String forma = sc.next();

		int precio=0; 

		String nproducto= "";
		String fpago= "";

		float operacion=0;
		String modalidad= "";

		float total=0;
		switch (producto.toLowerCase()) {
			case "tb":
				precio=350;
				nproducto="tablet";
				break;
			case "lt":
				precio=2300;
				nproducto="Laptop";
				break;
			case "mn":
				precio=850;
				nproducto="Monitor";
				break;
			case "im":
				precio=680;
				nproducto="Impresora";
				break;
			case "otro":
				precio=0;
				break;


		}

		float importe=precio*cantidad;


		switch (forma.toLowerCase()) {
			case "c1":
				operacion=importe*0.05f;
				fpago="contado";
				modalidad= "Descuento";
				break;
			case "c2":
				operacion=importe*0.12f;
				fpago="crédito";
				modalidad= "Incremento";
				break;

		}

		if (operacion==importe*0.05)
				total=importe-operacion;
		if (operacion==importe*0.12f)
				total=importe+operacion;

		System.out.println("Cliente: " + cliente);
		System.out.println("Producto: " + nproducto);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Importe: " + importe);
		System.out.println("Forma de pago: " + fpago);
		System.out.println("" + modalidad + ": " + operacion);
		System.out.println("Total a pagar: " + total);


	}

}



