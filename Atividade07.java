import java.util.Scanner;

public class Atividade07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] temp = new float[12];
            for(int i = 0;i < 12;i++){
                temp[i] = sc.nextFloat();
            }

            float maior = temp[0];
            float menor = temp[0];

        for(int i = 1;i < 12;i++){
            if(menor < temp[i]){
                menor = temp[i];
            }
            if(maior > temp[i]){
                maior = temp[i];
            }
        }

    }}