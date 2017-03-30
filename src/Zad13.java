import java.util.Scanner;

public class Zad13 {

    //Napisz program, który wypisuje co drugą literę imienia.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        for (int i = 1; i <name.length(); i+=2) {
            System.out.println(name.charAt(i));
        }
    }
}
