import java.util.Scanner;
public class Caso_14{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Alumno: ");
		String alumno = sc.nextLine();

		System.out.print("Carrera[DS/RC/DG/otro]: ");
		String carrera = sc.nextLine();


		System.out.print("Turno[M/T/N/otro]: ");
		String turno = sc.next();

		String nturno = "";

		float descuento =0;

		int monto=0;

		switch (carrera.toLowerCase()) {
			case "ds":
				monto=1500; 
				break;
			case "rc":
				monto=1400; 
				break;
			case "dg":
				monto=1300; 
				break;
			case "otro":
				monto=0; 
				break;


		}

		switch (turno.toLowerCase()) {
			case "m":
				descuento=monto*0.1f;
				nturno="Mañana"; 
				break;
			case "t":
				descuento=monto*0.2f;
				nturno="Tarde"; 
				break;
			case "n":
				descuento=monto*0.15f;
				nturno="Noche"; 
				break;
			case "otro":
				descuento=0; 
				break;

		}

		float total=monto-descuento;
		float totaldolares= total/3.33f;

		System.out.println("Monto: " + monto);
		System.out.println("Turno " + nturno);
		System.out.println("Descuento: " + descuento);
		System.out.println("Pago total: " + total);
		System.out.println("Pago total en dolares: " + totaldolares + "$");


	}

}



