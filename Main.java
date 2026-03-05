import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 1;
        int n = sc.nextInt();
            for(int i = n;i > 0; i--){
                soma = soma * i;
            }
        System.out.println(soma);

    }
}
