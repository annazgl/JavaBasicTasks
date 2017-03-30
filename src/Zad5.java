import java.util.Scanner;

public class Zad5 {

    //Stwórz program, który odczytuje wiek danej osoby i wypisuję na ekran komunikat czy dana osoba jest pełnoletnia
    // czy niepełnoletnia.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Jesteś pełnoletnia");
        }
        else{
            System.out.println("Jesteś niepełnoletnia");
        }

    }
}
