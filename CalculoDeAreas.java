package calculo;

import java.util.Scanner;

public class CalculoDeAreas {

	public static void menu() {
		System.out.println("CÁLCULO DE ÁREAS");
		System.out.println("=====================");
		System.out.println("1. Calcular el área de un triángulo");
		System.out.println("2. Calcular el área de un trapecio");
		System.out.println("3. Calcular el área de un rectángulo");
		System.out.println("4. Salir");
	}
	
	public static double calcularAreaTriangulo(int base, int altura) {
		return base * altura;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		int numeroMenu = sc.nextInt();
		if (numeroMenu == 1) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Inserte la base");
			int base = sc1.nextInt();
			System.out.println("Inserte la altura");
			int altura = sc1.nextInt();
			sc1.close();
			System.out.println("El área del triangulo es: " + calcularAreaTriangulo(base, altura));
		} 
		
	}

}
