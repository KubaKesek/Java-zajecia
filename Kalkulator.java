package zajecia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Podaj znak działania");
        Scanner scanner = new Scanner(System.in);
        String znak = scanner.nextLine();
        while(true) {
          if(znak.equals("x")){
              System.out.println("Dowidzdenia");
              break;

            }
        }

        if(znak.equals("+")){
            System.out.println("Podaj pierwszą liczbe");
            int pierwsza = scanner.nextInt();
            System.out.println("Podaj drugą liczbe");
            int druga = scanner.nextInt();
            System.out.println(pierwsza+druga);
        }
if(znak.equals("-")){
    System.out.println("Podaj pierwszą liczbe");
    int pierwsza = scanner.nextInt();
    System.out.println("Podaj druga liczbe");
    int druga = scanner.nextInt();
    System.out.println(pierwsza-druga);
}
if(znak.equals("*")){

    System.out.println("Podaj pierwsza liczbe");
    int pierwsza = scanner.nextInt();
    System.out.println("Podaj druga liczbe");
    int druga = scanner.nextInt();
    System.out.println(pierwsza*druga);
}
if(znak.equals("/")){
    System.out.println("Podaj pierwsza liczbe");
    int pierwsza = scanner.nextInt();
    System.out.println("Podaj druga liczbe");
    int druga = scanner.nextInt();
    System.out.println(pierwsza/druga);
}
if(znak.equals("%")){
    System.out.println("Podaj pierwsza liczbe");
    int pierwsza = scanner.nextInt();
    System.out.println("Podaj drugą liczbe");
    int druga = scanner.nextInt();
    System.out.println(pierwsza%druga);

}
else System.out.println("Podano zły znak");







    }
}
