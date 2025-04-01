import java.util.Locale;
import java.util.Scanner;

public class Menr {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       int n1, n2, n3, menor;
       
       System.out.print("primeirto valor: ");
       n1 = sc.nextInt();

       System.out.print("segundo valor: ");
       n2 = sc.nextInt(); 

       System.out.print("terceiro valor: ");
       n3 = sc.nextInt(); 

       menor = 0;

       if (n1 < n2 && n1 < n3) {
       menor = n1;
       } 
        else if (n2 < n3) {
        menor = n2;
        } 
         else{
         menor = n3;
         }   

         System.out.println("MENOR = " + menor);
         
    sc.close();
    }
}
   