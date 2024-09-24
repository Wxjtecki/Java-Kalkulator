//Kamil Pajączkowski

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuować = true;

        while (kontynuować) {
            
            System.out.print("Podaj pierwszą liczbę: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba! Spróbuj ponownie.");
                scanner.next(); 
            }
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba! Spróbuj ponownie.");
                scanner.next(); 
            }
            double liczba2 = scanner.nextDouble();

           
            System.out.println("Wybierz operację: +, -, *, /");
            char operacja = scanner.next().charAt(0);

            double wynik = 0;
            boolean valid = true;

           
            switch (operacja) {
                case '+':
                    wynik = liczba1 + liczba2;
                    break;
                case '-':
                    wynik = liczba1 - liczba2;
                    break;
                case '*':
                    wynik = liczba1 * liczba2;
                    break;
                case '/':
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można dzielić przez zero!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Niepoprawna operacja!");
                    valid = false;
            }

            
            if (valid) {
                System.out.printf("Wynik: %.2f%n", wynik);
            }

            System.out.println("Czy chcesz kontynuować? (tak/nie)");
            String odpowiedź = scanner.next();
            kontynuować = odpowiedź.equalsIgnoreCase("tak");
        }

        scanner.close();
    }
}
