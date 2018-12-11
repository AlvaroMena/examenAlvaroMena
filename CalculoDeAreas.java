package calculo;

import java.util.Scanner;

public class CalculoDeAreas {

	
	//Método que imprime en pantalla el menú con las diferentes opciones a seguir
	public static void menu() {
		System.out.println("CÁLCULO DE ÁREAS");
		System.out.println("=====================");
		System.out.println("1. Calcular el área de un triángulo");
		System.out.println("2. Calcular el área de un trapecio");
		System.out.println("3. Calcular el área de un rectángulo");
		System.out.println("4. Salir");
	}
	
	//Método que calcula el área del triángulo dados unos valores de base y altura
	public static double calcularAreaTriangulo(int base, int altura) {
		return (base * altura)/2;
	}
	
	//Método que calcula el área del trapecio dados unos valores de altura y dos lados.
	public static double calcularAreaTrapecio(int altura, int lado1, int lado2) {
		return ((lado1+lado2)/2)*altura;
	}
	
	//Método que calcula el área del rectángulo dados unos valores de base y altura
	public static double calcularAreaRectangulo(int base, int altura) {
		return base * altura;
	}
	
	//Main que llama a los anteriores métodos dependiendo de un parámetro numérico que se especifica en el menú previamente creado
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
		} else if (numeroMenu == 2) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Inserte la altura");
			int altura = sc2.nextInt();
			System.out.println("Inserte uno de los lados");
			int lado1 = sc2.nextInt();
			System.out.println("Inserte el otro lado");
			int lado2 = sc2.nextInt();
			sc2.close();
			System.out.println("El área del trapecio es: " + calcularAreaTrapecio(altura, lado1, lado2));
		} else if (numeroMenu == 3) {
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Inserte la altura");
			int altura = sc3.nextInt();
			System.out.println("Inserte la base");
			int base = sc3.nextInt();
			sc3.close();
			System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(altura, base));
		} else {
			System.exit(1);
		}
		sc.close();
	}

}
