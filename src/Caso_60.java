import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingreses el n�mero del d�a [1-7]: ");
		
		int numerodia= sc.nextInt();

		String nombredia = "";

		switch (numerodia) {
			case 1:
				nombredia= "Domingo";
				break;
			case 2:
				nombredia= "Lunes";
				break;
			case 3:
				nombredia= "Martes";
				break;
			case 4:
				nombredia= "Mi�rcoles";
				break;
			case 5:
				nombredia= "Jueves";
				break;
			case 6:
				nombredia= "Viernes";
				break;
			case 7:
				nombredia= "S�bado";
				break;
			default:
				nombredia = "Desconocido";

		}

		System.out.println("Nombre del d�a: " + nombredia);


	}
}


