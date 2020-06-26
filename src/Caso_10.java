import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese nombre del empleado: ");
		String empleado = sc.nextLine();

		System.out.print("Ingrese horas trabajadas: ");
		int horast = sc.nextInt();

		System.out.print("Ingrese tarifa por hora: ");
		int tarifah = sc.nextInt();

		System.out.print("Ingrese minutos de tardanza: ");
		int minutos = sc.nextInt();

		int importe= horast*tarifah;

		float bono = 0;

		float descuento = 0;


		if (horast>60)
			bono= importe*0.13f;
		else
			bono= importe*0.04f;


		if (minutos>15)
			descuento= importe*0.03f;
		else
			descuento= 0;


		float PAlcanzado= (float) (horast*100)/70;

		System.out.println("Importe: " + importe);
		System.out.println("Bono: " + bono);
		System.out.println("Descuento: " + descuento);
		System.out.println("Meta Alcanzada: " + PAlcanzado + "%");





	}

}



