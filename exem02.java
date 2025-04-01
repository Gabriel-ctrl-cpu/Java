import java.util.Locale;

public class exem02 {
    
    public static void main(String[] args) {
        
        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(String.format(Locale.US, "%.2f", y));

    }
}
