package aula02;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite n1: ");
	int n1 = entrada.nextInt();
	System.out.println("Digite n2: ");
	int n2 = entrada.nextInt();
	System.out.println("Digite n3: ");
	int n3 = entrada.nextInt();
	
	int resultado = n1>n2 && n1>n3? n1 : n2 > n1 && n2 > n3?n2:n3;
	System.out.println(resultado);
	
	}
}

