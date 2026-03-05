import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v1 = new int[n];
        int[] v2 = new int[n];

        System.out.println("Primeiro Vetor");
            for(int i=0;i<n;i++){
                v1[i] = sc.nextInt();
            }
        System.out.println("Segundo Vetor");
        for(int i=0;i<n;i++){
            v2[i] = sc.nextInt();
        }
        System.out.println("Intersecao: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(v1[i] == v2[j]){
                System.out.print(v1[i] + " ");
            }


}}}}
