import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uczen {
    public String imie;
    public String nazwisko;
    private int[] matematyka = new int[4];
    
    public Uczen() {
        this.imie = imie;
        this.nazwisko = nazwisko;



    }
    public void dodajMatematyka(int ocena) {
    }

    public void dodajMatematyka() {
        for (int i = 0; i < matematyka.length; i++) {
            if (matematyka[i] == 0) {

                System.out.println("Podaj ocene z Matematyki");
                Scanner scanner = new Scanner(System.in);
                matematyka[0] = scanner.nextInt();
            }
        }

        public void wyswietlOceny(){
            String ocenyMatematyka = "";
            for (int i = 0; i < 4; i++) {
                if (matematyka[i] != 0)

                    ocenyMatematyka += Integer.toString(i) + ". " + Integer.toString(matematyka[i]) + "/n";


            }
            System.out.println(ocenyMatematyka);


        }

    }}

