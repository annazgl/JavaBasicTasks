import java.util.Scanner;

public class Zad2 {

    //Napisz program, który odczytuje 2 zmienne i zamienia je.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;


        System.out.println(a);
        System.out.println(b);
    }

}
