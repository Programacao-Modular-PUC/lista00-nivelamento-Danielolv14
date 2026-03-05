import java.util.Scanner;

import static java.lang.foreign.MemorySegment.NULL;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v1 = new int[n];
        int[] v2 = new int[m];

        System.out.println("Primeiro Vetor");
        for(int i=0;i<n;i++){
            v1[i] = sc.nextInt();
        }
        System.out.println("Segundo Vetor");
        for(int i=0;i<m;i++){
            v2[i] = sc.nextInt();
        }
        int[] v3 = new int[n + m];
        for(int i = 0; i < n; i++){
            v3[i] = v1[i];
        }

        for(int i = 0; i < m; i++){
            v3[n + i] = v2[i];
        }
    }}