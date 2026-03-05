import java.util.Scanner;

import static java.lang.foreign.MemorySegment.NULL;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int contador = 0;

        while (true) {
            System.out.print("Idade (-1 para sair): ");
            idade = sc.nextInt();
                if (idade == -1) {
                break;
            }

            sc.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = sc.nextLine();

            System.out.print("Olhos (azuis/verdes/castanhos): ");
            String olhos = sc.nextLine();

            System.out.print("Cabelos (louros/castanhos/pretos): ");
            String cabelos = sc.nextLine();


            if (idade > maior) {
                maior = idade;
            }

            if (idade < menor) {
                menor = idade;
            }

            if (sexo.equalsIgnoreCase("F") &&
                    idade >= 18 && idade <= 35 &&
                    olhos.equalsIgnoreCase("verdes") &&
                    cabelos.equalsIgnoreCase("louros")) {

                contador++;
            }
        }

        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("Quantidade específica: " + contador);
    }}