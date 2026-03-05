import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];

        int somaPares = 0;
        int qtdImpares = 0;

        for(int i = 0; i < 6; i++){
            v[i] = sc.nextInt();
        }

        System.out.println("RELATORIO");

        System.out.println("Numeros pares:");
        for(int i = 0; i < 6; i++){
            if(v[i] % 2 == 0){
                System.out.println("numero " + v[i] + " na posicao " + (i+1));
                somaPares += v[i];
            }
        }

        System.out.println("Soma dos pares = " + somaPares);

        System.out.println("Numeros impares:");
        for(int i = 0; i < 6; i++){
            if(v[i] % 2 != 0){
                System.out.println("numero " + v[i] + " na posicao " + (i+1));
                qtdImpares++;
            }
        }

        System.out.println("Quantidade de impares = " + qtdImpares);
    }
}