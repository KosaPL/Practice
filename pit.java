import java.util.Scanner;

public class pit{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój dochód w formacie 00,00:");
        double dochod = in.nextDouble();

        if (dochod>=85.528)
        {double dochod1 = ((dochod*0.18)-556.02);
            System.out.println("Podatek wynosi:"+dochod1);}

        if (dochod<=85.528)
        {   double x = dochod - 85528;
            double dochod2 = 14839.02 + (0.32*x);
            System.out.println("Podatek wynosi: "+dochod2);
        }
    }
}







