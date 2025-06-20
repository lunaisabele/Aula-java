package aula02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o sexo(F ou M): ");
       char result = input.next().charAt(0);
       if (result == 'F' || result == 'f') {
    	   System.out.println("F - Feminino");
       }else if (result == 'M' || result == 'm') {
    	   System.out.println("M - Masculino");
       }else {
    	   System.out.println("Valor inválido");
       }
       input.close();
       }
	}


