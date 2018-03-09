package pl.edu.ur.main;

import java.util.Scanner;
/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
// ZAD 3

/*
    int[] tab = new int[10];
    char warunek;
    int wybor;
    
    Scanner scanner = new Scanner(System.in);
    do
    {
        System.out.println("Wprowadz 10 liczb rzeczywistych do tablicy: ");
    
        for(int i=0; i<10; i++)
        {
            tab[i]=scanner.nextInt();
        }
    
        System.out.println("W jaki sposob wyswietlic tablice?\n1 - indeksy rosnąco\n2 - indeksy malejąco\n3 - nieparzyste indeksy\n4 - parzyste indeksy\n Wybór: ");
        wybor = scanner.nextInt();
    
        if(wybor == 1)
        {
            for(int i=0; i<10; i++) // wyświetlanie rosnąco po indeksach
            {
                System.out.println("tab["+i+"] = "+tab[i]);
            }
            System.out.println("");
        }
        else if(wybor == 2)
        {
            for(int i=9; i>=0; i--) // wyświetlanie malejąco po indeksach
            {
                System.out.println("tab["+i+"] = "+tab[i]);
            }
            System.out.println("");
        }
        else if(wybor == 3)
        {
            for(int i=1; i<10; i+=2) // wyświetlanie nieparzystych indeksów
            {
                System.out.println("tab["+i+"] = "+tab[i]);
            }
            System.out.println("");
        }
        else if(wybor == 4)
        {
            for(int i=0; i<10; i+=2) // wyświetlanie parzystych indeksów
            {
                System.out.println("tab["+i+"] = "+tab[i]);
            }
            System.out.println("");
        }
        else
        {
            System.out.println("Zla opcja!");
            System.out.println("");
        }
        System.out.println("Czy zakonczyc dzialanie programu? T/N ");
        warunek = scanner.next().charAt(0);
    }while(warunek == 'N' || warunek == 'n' );
*/



// ZAD 4

/*
    float[] tab = new float[10];
    char warunek;
    float wybor, suma=0, iloczyn=1,srednia, minimum, maximum;
    
    Scanner scanner = new Scanner(System.in);
    do
    {
        System.out.println("Wprowadz 10 liczb rzeczywistych do tablicy: ");
    
        for(int i=0; i<10; i++)
        {
            tab[i]=scanner.nextInt();
        }
    
        System.out.println("W jaki sposob wyswietlic tablice?\n1 - suma \n2 - iloczyn\n3 - wartosc srednia\n4 - minimum\n5 - maksimum\nWybór: ");
        wybor = scanner.nextInt();
    
        if(wybor == 1)
        {
            for(int i=0; i<10; i++)
            {
                suma+=tab[i];
            }
            System.out.println("Suma elementow tablicy: "+suma);
            System.out.println("");
        }
        else if(wybor == 2)
        {
            for(int i=0; i<10; i++)
            {
                iloczyn*=tab[i];
            }
            System.out.println("Iloczyn elementow tablicy: "+iloczyn);
            System.out.println("");
        }
        else if(wybor == 3)
        {
            for(int i=0; i<10; i++)
            {
                suma+=tab[i];
            }
            srednia = suma/10;
            System.out.println("Srednia elementow w tablicy: "+srednia);
            System.out.println("");
        }
        else if(wybor == 4)
        {
            minimum = tab[0];
            for(int i=1; i<10; i++)
            {
                if(tab[i] <= minimum)
                {
                    minimum = tab[i];
                }
            }
            System.out.println("Najmniejsza wartosc w tablicy: "+minimum);
            System.out.println("");
        }
        else if(wybor == 5)
        {
            maximum = tab[0];
            for(int i=1; i<10; i++)
            {
                if(tab[i] >= maximum)
                {
                    maximum = tab[i];
                }
            }
            System.out.println("Najwieksza wartosc w tablicy: "+maximum);
            System.out.println("");
        }
        else
        {
            System.out.println("Zla opcja!");
            System.out.println("");
        }
        System.out.println("Czy zakonczyc dzialanie programu? T/N ");
        warunek = scanner.next().charAt(0);
    }while(warunek == 'N' || warunek == 'n' );
*/
    
    
//ZAD 6

/*
    int liczba;
    
    Scanner scanner = new Scanner(System.in);
    
    while(true)
    {
        System.out.println("Podaj liczbe calkowita: ");
        liczba = scanner.nextInt();
        
        if(liczba <0)
            break;
    }
*/
    
    
    
// ZAD 7

/*
    int n, temp, zmiana = 1;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Podaj ilosc elementow tablicy: ");
    n = scanner.nextInt();
    
    int[] tab = new int[n];
    
    System.out.println("Podaj "+n+" liczb: " );
    
    for(int i=0; i<tab.length; i++)
    {
        tab[i] = scanner.nextInt();
    }
    
    System.out.println("");
    
    while(zmiana > 0) // srotowanie bąbelkowe
    {
        zmiana = 0;
        for(int i=0; i<tab.length-1; i++)
        {
            if(tab[i]>tab[i+1])
            {
                temp = tab[i+1];
                tab[i+1] = tab[i];
                tab[i] = temp;
                zmiana++;
            }
        }
    }
    
    for(int i=0; i<tab.length; i++)
    {
        System.out.print(tab[i]+" ");
    }
*/   
    }
}