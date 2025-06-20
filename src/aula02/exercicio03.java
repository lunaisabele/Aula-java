package aula02;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero= entrada.nextInt();
		
		String resultado = (numero==1)?"Segunda-feira":
					 (numero==2)?"Terça-feira":
					 (numero==3)?"Quarta-feira":
					 (numero==4)?"Quinta-feira":
					 (numero==5)?"Sexta-feira":
					 (numero==6)?"Sabado":
					 (numero==7)?"Domingo":
						 "Número inválido";
		System.out.println(resultado);
		entrada.close();
		
							 
							 
		}
		
		
	
}

