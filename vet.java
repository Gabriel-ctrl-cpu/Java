import java.util.Scanner;
import java.util.Locale;

public class vet {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         int n;

         System.out.print("Quantos numeros voce vai digitar? ");
         n = sc.nextInt();

         double[] vet = new double[n];

         for (int i = 0; i < n; i++){
            System.out.print("Digite um numeto: ");
            vet[i] = sc.nextDouble();
         }
         System.out.println();
         System.out.println("NUMEROS DIGITADOS: ");
         
         for(int i = 0; i < n; i++){
            System.out.println(String.format("%.1f",vet[i]));
         }

    sc.close();
    }
}
   