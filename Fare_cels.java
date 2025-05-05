import java.util.Scanner;
import java.util.Locale;

public class Fare_cels {    
   
        static double fare(int x){
            return (x * 1.8) + 32;
        }
        static double cels(int y){
            return (y - 32) / 1.8;
        }
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;
        double resul1,resul2;

        System.out.println("Digite so valor de celsius para converter em fahrenheit: ");
        x = sc.nextInt();
        

        System.out.println("Digite so valor de fahrenheit para converter em celsius: ");
        y = sc.nextInt();

        resul1 = fare(x);
        resul2 = cels(y);

        System.out.println("Resultado em fahrenheit:" + String.format(Locale.US,"%.2f",resul1));
        System.out.println("Reusltado em celsius: " + String.format(Locale.US,"%.2f", resul2));


    sc.close();
    }
}