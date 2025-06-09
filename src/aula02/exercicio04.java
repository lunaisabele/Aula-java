package aula02;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite n1: ");
        double n1 = entrada.nextDouble(); 

        System.out.println("Digite n2: ");
        double n2 = entrada.nextDouble(); 

        double media = (n1 + n2) / 2; 

        System.out.println("A média é: " + media);

        entrada.close(); 
    }
}
