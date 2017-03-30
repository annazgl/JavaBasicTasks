import java.util.Scanner;

public class Zad9 {

    //Napisz program, który odczytuje dwie zmienne i na ekran wypisuje komunikat sprawdzający czy obie zmienne są równe.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        System.out.println(name.charAt(length-1));

    }

}
