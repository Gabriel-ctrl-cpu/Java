import java.util.Scanner;
import java.util.Locale;

public class DesCres {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite dois numeros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        while (n1 != n2) {
            if (n1 > n2) {
                System.out.println("DECRESCENTE!");                
            }
            else{
                System.out.println("CRESCENTE!");
            }
            System.out.println("Digite outros dois valores: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }
    sc.close();
    }
}
   