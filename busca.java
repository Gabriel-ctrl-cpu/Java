import java.util.Scanner;
import java.util.Locale;

public class busca {    

    static int achei(int localizar,int vet[], int n){
        for(int i = 0; i < n; i++){
            if (vet[i] == localizar){
                return i + 1;    
            }
        }    
        return -1;
    }
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int localizar = 0;
        int encontrei = 0;

        System.out.println("qual o tamanho do vetor: ");
        n = sc.nextInt();

        int[] vet = new int[n];

        System.out.println("Digite os numeros: ");
        for(int i = 0; i < n; i++){
            vet[i] = sc.nextInt();
        }
        System.out.println("Digite o numero que vc quer achar: ");
        localizar = sc.nextInt();

        int posicao = achei(localizar, vet, n);

        System.out.println("Posição: " + posicao); 

    sc.close();
    }
}