import java.util.Scanner;
import java.util.Locale;

public class Entra {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario1, salario2;
        String nome1, nome2;
        int idade;
        char sexo;

    System.out.println("Nome da primeira pessoa: ");
    nome1 = sc.nextLine();

    System.out.println("Salario da primeira pessoa: ");
    salario1 = sc.nextDouble();
    sc.nextLine();        //------------------------limpeza de buff    

    System.out.println("Nome da segunda pessoa: ");
    nome2 = sc.nextLine();

    System.out.println("Salario da segunda pessoa: ");
    salario2 = sc.nextDouble();
    sc.nextLine();        //------------------------limpeza de buff    

    System.out.println("Digite uma idade: ");
    idade = sc.nextInt();

    System.out.println("Digite o sexo (F/M): ");
    sexo = sc.next().charAt(0);
    
    System.out.println("Nome 1: " + nome1);
    System.out.println("Salario 1: " + String.format("%.2f", salario1));
    System.out.println("Nome 2: " + nome2);
    System.out.println("Salario 2: " + String.format("%.2f", salario2));
    System.out.println("idade: " + idade);
    System.out.println("Sexo: " + sexo);    

    sc.close();
    }
}
   