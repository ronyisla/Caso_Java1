import java.util.Scanner;

public class Caso_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		int i = 1;
		
		int menor = 0;
		
		while (i <= 5) {
			
			System.out.print("Ingrese n�mero " + i + ": ");
			n = sc.nextInt();
			
			if(n > menor)
				menor = n;
			
			i++;
			
			
		}
		
		System.out.println("El n�mero menor es: " + menor);
	}

}



