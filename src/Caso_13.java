import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Empleado: ");
		
        String nombre= sc.nextLine();

        System.out.print("Nivel: ");
        
        int nivel = sc.nextInt();

        System.out.print("Sueldo: ");
    
        float sueldo= sc.nextFloat();

        float incremento=0;

        switch (nivel) {
        	case 1:
        		incremento= 0.045f;
        		break;
        	case 2:
        		incremento= 0.06f;
        		break;
        	case 3:
        		incremento= 0.085f;
        		break;
        	case 4:
        		incremento= 1.1f;
        		break;
        }

        if (nivel>=5)
        	incremento=0;


        float nuevosueldo= sueldo + sueldo*incremento;

        System.out.println("El incremento es del: " + incremento*100 + "%");
        System.out.println("EL nuevo sueldo es de: " + nuevosueldo);



	}

}


