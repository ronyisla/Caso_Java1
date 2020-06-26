import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");

		System.out.print("Ingrese el nombre de alumno: ");
		String nombre= sc.nextLine();

		System.out.print("Ingrese nota 1: ");
		int nota1 = sc.nextInt();

		System.out.print("Ingrese nota 2: ");
		int nota2 = sc.nextInt();

		System.out.print("Ingrese asistencia : ");
		int asistencia = sc.nextInt();

		float promedio= nota1*0.3f + nota2*0.7f;
		float porcentaje= (asistencia*100)/12;
		String estado="Desaprobado";

		if (promedio >= 13 && porcentaje >=70)
			estado= "Aprobado";

		System.out.println("Alumno: " + (nombre));
		System.out.println("Promedio: " + df.format(promedio));
		System.out.println("Asistencia: " + (porcentaje) + "%");
		System.out.println("Estado: " + (estado));





	}

}



