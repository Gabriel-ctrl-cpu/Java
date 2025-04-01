import java.util.Scanner;
import java.util.Locale;

public class idade {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double media;
        int idade1, idade2;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();

        sc.nextLine(); //limpeza de biff

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();

        media = (double)(idade1 + idade2) / 2;

        System.out.println("A idade media de " + nome1 + " e " + nome2 + " eh de " + String.format("%.1f", media) + " anos");

    sc.close();
    }
}
   
