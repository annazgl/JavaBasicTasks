import java.util.Scanner;

public class Zad10 {

    //Napisz program, który odczytuję imię i wypisuję na ekran ostatnią literę imienia.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        for(int i = name.length()-1; i>=0; i-- ){
            System.out.print(name.charAt(i));
        }


    }
}