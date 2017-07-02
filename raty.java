//02.07.2017
//Program wyliczający wysokość raty uwzględniający wartość towaru, liczbę rat oraz oprocentowanie.


import java.util.Scanner;

public class raty {
public static void main (String[] args){

    double cena, oprocentowanie, wysokoscOprocentowania, wysokoscRaty;
    Scanner in = new Scanner(System.in);
    System.out.println("Program wylicza miesięczną ratę zakupu towaru");
    System.out.println("Wprowadź wartość towaru:");
    cena = in.nextDouble();
    while (cena<100 || cena>10000)
    {System.out.println("Wartość musi wnosić od 100 do 10000 zł: ");
        cena = in.nextDouble();
    }
    System.out.println("Wprowadź liczbę rat (6-48):");
    int liczbaRat = in.nextInt();
    while (liczbaRat<=5)
    {System.out.println("Wprowadź liczbę rat (6-48):");
        liczbaRat = in.nextInt();}
    oprocentowanie = 0;
    if (liczbaRat>=6)  {oprocentowanie = 0.025;
    if  (liczbaRat>=13) oprocentowanie = 0.05;
    if (liczbaRat>=25) oprocentowanie = 0.1;}
    while (liczbaRat>48)
    {System.out.println("Wprowadź liczbę rat (6-48):");
        liczbaRat = in.nextInt();}

        wysokoscOprocentowania = (cena/liczbaRat)*oprocentowanie;
        wysokoscRaty = (cena/liczbaRat)+wysokoscOprocentowania;
    java.text.DecimalFormat  df = new java.text.DecimalFormat();
    df.setMaximumFractionDigits(2);
    df.setMinimumFractionDigits(2);
    System.out.println("Wysokość raty wynosi: "+df.format(wysokoscRaty));




}
}
