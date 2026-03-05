import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] vendas = new double[12][4];

        String[] meses = {
                "Janeiro","Fevereiro","Marco","Abril",
                "Maio","Junho","Julho","Agosto",
                "Setembro","Outubro","Novembro","Dezembro"
        };

        double totalAno = 0;

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Venda do mes " + meses[i] +
                        " semana " + (j+1) + ": ");
                vendas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nTotal por mes:");
        for(int i = 0; i < 12; i++){
            double totalMes = 0;
            for(int j = 0; j < 4; j++){
                totalMes += vendas[i][j];
            }
            System.out.println(meses[i] + ": " + totalMes);
            totalAno += totalMes;
        }

        System.out.println("\nTotal por semana no ano:");
        for(int j = 0; j < 4; j++){
            double totalSemana = 0;
            for(int i = 0; i < 12; i++){
                totalSemana += vendas[i][j];
            }
            System.out.println("Semana " + (j+1) + ": " + totalSemana);
        }

        System.out.println("\nTotal vendido no ano: " + totalAno);
    }
}