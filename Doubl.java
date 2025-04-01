import java.util.Locale;

public class Doubl {
    
    public static void main(String[] args) {
        
        double  x;
        
        x = 2.3456;

        System.out.println(String.format(Locale.US,"%.2f", x));

    }
}
