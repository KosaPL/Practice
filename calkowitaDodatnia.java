//05.07.2017
//Program pobiera liczbę a następnie wyświetla na ekranie wszystkie liczby nieparzyste nie większe od podanej liczby.

import java.util.Scanner;

public class calkowitaDodatnia {
    public static void main(String[] args) {

        System.out.println("Wpisz liczbę całkowitą dodatnią");
        Scanner in = new Scanner(System.in);
        int a;
        for (a = in.nextInt(); a>=0; a--) {

            if (a % 2 == 0);
                else System.out.println("a=" + a);
        }

    }
}