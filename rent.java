import java.util.Scanner;
import java.util.Locale;

public class rent {    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, peri, diag;

        System.out.print("Base do retandulo: ");
        base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        peri = 2 *(base + altura);
        diag = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", peri));
        System.out.println("DIAGONAL = " + String.format("%.4f", diag));


    sc.close();
    }
}
   