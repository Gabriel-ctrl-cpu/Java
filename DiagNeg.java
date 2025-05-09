import java.util.Scanner;
import java.util.Locale;

public class DiagNeg {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int n, quat;

       System.out.print("Qual a ordem da matriz? ");
       n = sc.nextInt();
       
       int[][] mat = new int[n][n];

       for(int i = 0;i < n; i++){
        for(int j = 0;j < n; j++){
            System.out.print("Elemento [" + i + "," + j + "]: ");
            mat[i][j] = sc.nextInt();
        }
       }

       System.out.println("DIAGONAL PRINCIPAL: ");

       for(int i = 0;i < n; i++){
            System.out.print(mat[i][i] + "  ");
        }

       System.out.println();
        
       quat = 0;
       
       for(int i = 0;i < n; i++){
        for(int j = 0;j < n; j++){
            if (mat[i][j] < 0) {
                quat = quat + 1;
            }
        }
       }
       System.out.println("QUANTIDADE DE NEGATIVOS = " + quat);

    sc.close();
    }
}