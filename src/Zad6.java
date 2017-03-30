import java.util.Scanner;

public class Zad6 {

    //Stwórz program, który odczytuję daną liczbę i sprawdza czy jest podzielna przez 4.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number % 4 == 0);
    }
}
