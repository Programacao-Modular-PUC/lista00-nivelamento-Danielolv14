import java.util.Scanner;

public class Atividade08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[10];
        int[] quantidade = new int[10];

        double totalGeral = 0;
        int maisVendido = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Preco do objeto " + (i+1) + ": ");
            preco[i] = sc.nextDouble();

            System.out.print("Quantidade vendida: ");
            quantidade[i] = sc.nextInt();
        }

        System.out.println("\nRELATORIO");

        for(int i = 0; i < 10; i++){
            double totalObjeto = preco[i] * quantidade[i];
            totalGeral += totalObjeto;

            System.out.println("Objeto " + (i+1));
            System.out.println("Quantidade: " + quantidade[i]);
            System.out.println("Preco: " + preco[i]);
            System.out.println("Total: " + totalObjeto);
            System.out.println();

            if(quantidade[i] > quantidade[maisVendido]){
                maisVendido = i;
            }
        }

        double comissao = totalGeral * 0.05;
        double salarioFinal = 545 + comissao;

        System.out.println("Total Geral: " + totalGeral);
        System.out.println("Comissao: " + comissao);
        System.out.println("Salario Final: " + salarioFinal);

        System.out.println("Objeto mais vendido esta na posicao " + (maisVendido+1));
        System.out.println("Valor do objeto mais vendido: " + preco[maisVendido]);
    }
    }