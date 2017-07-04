// 04.07.2017
//Prosty kalkulator wykonujący operację dodawania, odejmowania, mnożenia i dzielenia.

import java.util.Scanner;
public class kalkulator {
    public static void main (String [] args)
    {
        int y, x, wynik;
        System.out.println("Program wykonuje działanie dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych.");
        System.out.println("Wprowadź pierwszą liczbę");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.println("Wprowadź znak operacji arytmetycznej(+,-,/,*):");
        String operacja = in.next();
        System.out.println("Wprowadź drugą liczbę");
        y = in.nextInt();
        switch (operacja)
        {
            case "+":
                wynik = x + y;
                System.out.println(wynik);
                break;
            case "-":
                wynik = x - y;
                System.out.println(wynik);
                break;
            case "/":
                if (x==0) if (y==0) {System.out.println("Nie można dzielić przez 0!"); break;}
                wynik = x / y;
                System.out.println(wynik);
                break;
            case "*":
                wynik = x * y;
                System.out.println(wynik);
                break;
            default:
                System.out.println("Nie można wykonać działania - wprowadzono niepoprawny znak operacji!");
                break;

        }

    }

}

