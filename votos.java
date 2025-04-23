import java.util.Scanner;
import java.util.Locale;

public class votos {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Parcipantes:");
        System.out.println("1 Alice\n2 Heitor\n3 Isabela");

        System.out.println();
        System.out.print("Quantas pessoas vao digitar:");
        n = sc.nextInt();

        int[] vot = new int[n];
        int votosAlice = 0; 
        int votosIsabela = 0;
        int votosHeitor = 0;
        int votosNulo = 0;


        for(int i = 0; i < n; i++){
        System.out.print("voto do aluno " + (i+1) + " :");
        vot[i]= sc.nextInt();
        }
        for(int i = 0; i < n; i++){
          if (vot[i] == 1){
            votosAlice++;
          }else if (vot[i] == 2) {
            votosHeitor++;
          }else if (vot[i] == 3) {
            votosIsabela++;
          }else{
            votosNulo++;
          }
        }
        System.out.println();

        System.out.println("Alice:" + votosAlice + " Voto(s)");
        System.out.println("Heitor:" + votosHeitor + " Voto(s)");
        System.out.println("Isabela:" + votosIsabela + " Voto(s)");
        System.out.println("Nulos:" + votosNulo + " Voto(s)");

        if(votosAlice > votosHeitor && votosAlice > votosIsabela && votosAlice > votosNulo){
            System.out.println("Vencedor: Alice");
        }else if (votosHeitor > votosAlice && votosHeitor > votosIsabela && votosHeitor > votosNulo){
            System.out.println("Vencedor: Heitor");
        }else if(votosIsabela > votosAlice && votosIsabela > votosHeitor && votosIsabela > votosNulo){
            System.out.println("Vencedor: Isabela");
        }else{
            System.out.println("Empate");
        }
    }
}