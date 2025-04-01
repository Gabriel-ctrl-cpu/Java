import java.util.Scanner;
import java.util.Locale;

public class mat {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, j, m, n;

        System.out.print("Quantas linhas vai ter a matriz? ");
        m = sc.nextInt();

        sc.nextLine();

        System.out.print("Quantas colunas vai ter a matriz? ");
        n = sc.nextInt();
          
        int[][] mat = new int [m][n];

        for(i = 0; i < m; i++){
            for(j = 0;j < n; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("MATRIX DIGITADA:");
        
        for(i = 0; i < m; i++){
            for(j = 0;j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    sc.close();
    }
}
   