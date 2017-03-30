import java.util.Scanner;

public class Zad3 {

    //Napisz program, który odczytuje liczbę typu double i na ekran wypisuje całkowitą wartość tej liczby.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println((int)a);
    }
}
