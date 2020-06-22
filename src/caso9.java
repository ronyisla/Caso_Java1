import java.util.Scanner;
public class caso9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System. in);
		
		String continuacion = "s" , nombre , estado , nameMayorProm = "", nameMenorProm = "";
		int n1 ,n2 ,c =0 , nAsistencias, conCerti = 0 , sinCerti = 0;
		float promedio , porAsis , mayorProm = 0, menorProm = 999999999 ;
		
		while(continuacion.equalsIgnoreCase("S")) {
		//while(continuacion,equals("S") ll continuacion,equals("S")) {
			c++;
			System.out.println("************\n*REGISTRO " + c + "*\n************");
			
			System.out.println("Nombre del alumno: ");
			nombre = sc.nextLine();
			
			System.out.print("Nota #1 del alumno " + nombre + ": ");
			n1 = sc.nextInt();
			
			System.out.print("Nota #2 del alumno " + nombre + ": ");
			n2 = sc.nextInt();
			
			System.out.print("Nota #3 del alumno " + nombre + ": ");
			n3 = sc.nextInt();
			
			System.out.print("Asistencia del alumno " + nombre + " de la 12 sesiones: " );
			nAsistencias = sc.nextInt();
			
			System.out.println("************\n*RESULTADOS*\n************");
			
			promedio = (float) (((n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5)));
			porAsis = (float) (( nAsistencias * 100) / 12);
			if(promedio>=13 && porAsis >=70) {
				estado = "obtiene certificado";
				conCerti++;
			}else {	
				estado = "obtiene certificado";
				sinCerti++;
			}
			System.out.println("Promedio: " + promedio);
			System.out.println("Porcentaje de asistencia: " + porAsis + "%");
			
			System.out.println("");
			
			sc.nextLine();
			
			if(promedio>mayorProm) {
				mayorProm = promedio;
				nameMayorProm = nombre;
			}
			if(promedio<menorProm) {
				menorProm = promedio;
				nameMenorProm = nombre;
			}
			System.out.print("+Deseas Registrar otro alumno? [S/N] : ");
			continuacion = sc.nextLine();
		}
	if(continuacion.equals("n") ll continuacion.equals("N")) {
			System.out.println("*********\n*RESUMEN*\n*********");
			System.out.println("Numero de alumno : " + c);
			System.out.println("El mayor promedio es de " + mayorProm + " y pertenece a " + nameMayorProm);
			System.out.println("El mayor promedio es de " + menorProm + " y pertenece a " + nameMenorProm);
			System.out.println("Numero de alumnos con certificados: " + conCerti);
			System.out.println("Numero de alumnos sin certificados: " + sinCerti);
			
	}else
		System.out.print("Opcion invalida" );
	
  }
	
}	
	
	
	
