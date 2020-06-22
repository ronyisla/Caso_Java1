import java.util.Scanner;
public class Caso10 {
	
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System. in);
		
		String name , continuacion = "si" , nameNetoMayor = "", nameNetMenor ="" , nameMayorTar = "";
		int hortraba, mintar , c=0, cp=0;
		float suelBruto, boni = 0 , suelNeto , porcenAlncanzado , tarixHora , netoMayor = 0, netoMenor = 9999999 ,mayorMinTar = 0;
		System.out.println("REGISTRO DE EMPLEADOS");
		System.out.println("______________________");
		System.out.println("");
		
		while(continuacion.equalsIgnoreCase("Si")) {
			    c++;
			    System.out.println("*************************"\n*Registro de Empleado #" + c + "*\n*************************" );
			    System.out.println("_Nombre del empleado: ");
			    name = sc.nextLine();
			    System.out.print("-Horas trabajas del empleado: " + name + ": ");
			    hortraba = sc.nextInt();
			    System.out.print("_Tarifa horaria del empleado " + name + ": ");
			    tarixhora = sc.nextfloat();
			    System.out.print("-Minutos de tardanza del empleado " + name + ": ");
			    minTar = sc.nextInt();
			    
			    suelBruto = hortraba * tarixHora;
			    
			    if(horTraba <=50) {
			    	boni = 0;
			    }else if(horTraba > 50 && hortraba <=60){
			    	boni = 0.02f * suelBruto;
			    }else if(horTraba > 60 && horTraba <=70){
			    	boni = 0.08f * suelBruto;
			    }else if(horTraba > 70 && horTraba >=80){
			    	boni = 0.13f * suelBruto;
			    }else if(horTra > 80){
			    	boni = 0.015f * suelBruto;
			    }
			    if(minTar <=15) {
			    	descuento = 0;
			    }else if(minTar>15 && minTar<30){
			    	descuento = (( 0.3f * suelBruto) * minTar) / 100;
			    }else if(minTar > 30){	
			    	descuento = (( 0.5f * suelBruto) * minTar) / 100;
			    }
			    suelNeto =  (suelBruto + boni) - descuento;
			    
			    porcenAlcanzado = (float)((horTraba * 100) / 80);
			    //sueldo mayor
			    if(suelNeto > netoMayor) {
			    	netoMayor = suelNeto;
			    	nameNetoMenor = name;
			    }
			    //sueldo menor
			    if(suelNeto < netoMenor) {
			    	netoMenor = suelNeto;
			    	nameNetoMenor = name;
			    }
			    //mayor minutos de tardanza
			    if(minTar > mayorMintar) {
			    	mayorMinTar = MinTar;
			    	nameMayorTar = name;
			    }
			    //meta alcanzada
			    if(porcenaAlcanzado>90)
			    	cp++;
			    
			    sc.nextLine();
			    
			    System.out.println("\n¿Quieres seguir añadiendo empleado? [Si /No]");
			    copntinuacion = sc.nextLine();
			    
			    if(continuacion.equalsIgnoreCase("no")) {
			    	//resumen
			    	System.out.println("_______________\n \n resumen \n_____________");
			    	System.out.println("");
			    	System.out.println("Numero de empleados registrado: " + c + ".");
			    	System.out.println("El sueldo neto mayor es de " + netoMayor + " y pertenece a " + nameNetoMayor + ".");
			    	System.out.println("El sueldo neto menor es de " + netoMenor + " y pertenece a " + nameNetoMenor + ".");
			    	System.out.println("El empleado con la mayor cantidad de minutos de tardanza es " + nameMayorTar + " con " + mayorMinTar + " minutos.");
			    	Systwem.out.println("Cantidad de empleados con mas del 90% de la neta: " + cp);
			    }else if(continuacion.equalsIgnoreCase("si"))
			    	System.out.println("");
			    else
			    	System.out.println("\nOPCION INVALIDA \nIngrese solo `SI` O `NO` ");
			    
	 }
 }	
}			    	
			     
				