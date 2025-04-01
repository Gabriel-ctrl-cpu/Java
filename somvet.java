import java.util.Scanner;
import java.util.Locale;

public class somvet {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma, media;
        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        sc.nextLine();

        System.out.print("VALORES = ");
        for(int i = 0; i < n; i++){
            System.out.print(String.format("%.1f", vet[i]) + "  ");
        }

        System.out.println();

        soma = 0;

        for(int i = 0; i < n; i++){
            soma = soma + vet[i];
        }
        System.out.println("SOMA = " + String.format("%.2f", soma));

        media = 0;

        for(int i = 0; i < n; i++){
            media = media + vet[i];
        }
        media = media / n;

        System.out.println("MEDIA = " + String.format("%.2f", media));


    sc.close();
    }
}