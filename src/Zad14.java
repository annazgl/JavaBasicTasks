import java.util.Scanner;

public class Zad14 {

    //Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi napoprawnie wprowadzone hasło.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userPassword = "Kot";
        String Password;

        do {
            System.out.println("Podaj hasło");
            Password = sc.nextLine();
        }
        while(!Password.equals(userPassword));
        System.out.println("ok");
    }

}

