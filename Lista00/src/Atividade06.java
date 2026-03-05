import java.util.Scanner;

public class Atividade06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            char[] gab = new char[8];
            for(int i=0;i<8;i++){
                System.out.println("Digite a Resposta da Questao " + (1+i));
                gab[i] = sc.next().charAt(0);
            }


        char[] resp = new char[8];
        int n = sc.nextInt();
        int[] alunos = new int[n];

            for(int i=0;i<n;i++){
                int nota=0;
                for(int j=0;j<8;j++){
                    resp[j] = sc.next().charAt(0);
                    if(resp[j] == gab[j]){
                        nota++;
                    }

                }
                if(nota >= 6){
                    System.out.println("Aluno: " + (1+i) + "\n Nota: " + nota + "\n Aprovado!");
                } else {
                    System.out.println("Aluno: " + (1+i) + "\n Nota: " + nota + "\n Reprovado!");
                }
            }


}}
