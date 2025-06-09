package aula02;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respostasPositivas = 0;

        System.out.println("Responda com 'sim' ou 'nao':");

        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("Devia para a vítima? ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("sim")) respostasPositivas++;

        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

      scanner.close();
    }

	
		
			
	
		}
	

