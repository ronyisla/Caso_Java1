import java.util.Scanner;

public class Caso_4 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = 0;
			
			int i = 1;
			
			int mayor = 0;
			
			while (i <= 4) {
				
				System.out.print("Ingrese n�mero " + i + ": ");
				n = sc.nextInt();
				
				if(n > mayor)
					mayor = n;
				
				i++;
				
				
			}
			
			System.out.println("El n�mero mayor es: " + mayor);
		}


	}





