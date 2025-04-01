import java.util.Scanner;
import java.util.Locale;

public class impar {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2, soma, troca;
        soma = 0;

        System.out.println("Digite dois numeros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 > n2) {
            troca = n1;
            n1 = n2;
            n2 = troca;
        }

        for (int i = n1+1; i < n2; i++)
            if (i % 2 != 0) {
                soma = soma + i;
            }

            System.out.println("SOMA DOS IMPARES = " +  soma);








    sc.close();
    }
}