import java.util.Scanner;

public class Atividade02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] variaveis = new int[3];
            System.out.println("x:");
                variaveis[0] = sc.nextInt();
            System.out.println("y:");
                variaveis[1] = sc.nextInt();
            System.out.println("z:");
                variaveis[2] = sc.nextInt();

                int maior = variaveis[0];
                int menor = variaveis[0];

                 for(int i=0;i<3;i++){
                     if(maior < variaveis[i]){
                         maior = variaveis[i];
                     }
                     if(menor > variaveis[i]){
                         menor = variaveis[i];
                     }

                 }
            if(variaveis[0] >= variaveis[1] && variaveis[0] <= variaveis[2]){
                System.out.println("Dentro do Intervalo.");
            } else{
                System.out.println("Fora do Intervalo.");
            }
            if(variaveis[0] % variaveis[1] == 0){
        System.out.println("Divisivel por y");
    }
            if(variaveis[0] % variaveis[2] == 0){
        System.out.println("Divisivel por z");
    }
}}

